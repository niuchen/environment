<!DOCTYPE html>
<html>

<head>

    <base href=" ${basepath}">
	    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <title> </title>
<#include "/public_css.ftl" >
     <link rel="stylesheet" href="css/model/rygj.css">

    <style type="text/css">
        body, html,#allmap {width: 100%;height: 100%;overflow: hidden;margin:0;font-family:"微软雅黑";}
    </style>
</head>

<body>
<form role="form" class="select-box border-bottom-style" >
    <table id="data_1">
        <tr>
            <td class="control-label" >设备名称：

            </td>
            <td class="input-group date">
                <input class="form-control layer-date" id="dtm_time">
            </td>
            <td >
                <a class="lf-btn blue-btn btn-primary" onclick="rygjMap()" >查询</a>
            </td>
        </tr>
    </table>
</form>
<!--加载地图  -->
<div id="allmap"></div>


</body>



<#include "/public_js.ftl" >
<script type="text/javascript" src="http://api.map.baidu.com/api?v=2.0&ak=WzaT655XL9yMmiPr324iGaQHTqmah2cv"></script>

<!-- <script type="text/javascript" src="szwqbts/js/baidumap.js"></script>百度地图 -->
<script>
   //  百度地图API功能
    var map = new BMap.Map("allmap");    // 创建Map实例
   map.centerAndZoom(new BMap.Point(116.404, 39.915), 11);  // 初始化地图,设置中心点坐标和地图级别
    map.addControl(new BMap.MapTypeControl());   //添加地图类型控件
   //   map.setCurrentCity("河南");          // 设置地图显示的城市 此项是必须设置的
    map.enableScrollWheelZoom(true);     //开启鼠标滚轮缩放


   //    // 编写自定义函数,创建标注
   function addMarker(obj,i){
       var point = new BMap.Point(obj.p015,obj.p014);
       var marker = new BMap.Marker(point);
       marker.enableDragging() ;// 开启拖拽功能
       marker.setTitle(obj.v_equipment_name);//添加标题
       var label = new BMap.Label(obj.v_equipment_name,{offset:new BMap.Size(-14,-5)});
        label.setStyle({
               // color : "#fff",
         //  fontSize : "16px"
        //  backgroundColor :"0.05",
            border:"none"
         //  ,fontWeight :"bold"
       });
       marker.setLabel(label);
       marker.bmap_stop_group=obj;
       marker.indexid=i;
       marker.addEventListener('mouseover', function (e) {// 鼠标移动上图标标识上// 变颜色
           var p = e.target;
           p.setTop(true) ;
       });
       marker.addEventListener('mouseout', function (e) {// 鼠标移动上图标标识上// 变颜色
           var p = e.target;
           p.setTop(false) ;
       });
       marker.addEventListener('click', function (e) {// 图标单击
           var p = e.target;
           var geoc = new BMap.Geocoder();//地址转中文
           geoc.getLocation(e.point, function(rs){
               var addComp = rs.addressComponents;
               var addvar=addComp.province + "" + addComp.city + "" + addComp.district + "" + addComp.street + "" + addComp.streetNumber;
               var opts = {
                   width: 200, // 信息窗口宽度
                   height: 100, // 信息窗口高度
                   title:"<p align=\"center\"><strong><span style=\"color:#E53333;\">信息</br>"+addvar+"</br>"+p.getTitle()+"</span></strong></p>", // 信息窗口标题
                   enableMessage: false//设置允许信息窗发送短息
               };
              var htmlctext="<p align=\"center\"><span style=\"color:#000000\">设备名:"+p.bmap_stop_group.v_equipment_name+"</span></p>";
                var infowindow = new BMap.InfoWindow(htmlctext, opts);
               p.openInfoWindow(infowindow);
            });


       });

       map.addOverlay(marker);
   }
    var aj = $.ajax( {
        url:'Equipment_data/Equipment_dateList.htm',// 跳转到 action
        data:{},
        type:'post',
        cache:false,
        dataType:'json',
        success:function(data) {
            if(data.msg =="true" ){
               // var json_data =  JSON.parse(data);
               // alert(data.list.length);
                for(var i=0;i<data.list.length;i++){
                    var obj=data.list[i];
                  //  alert(obj.p015+" "+obj.p014);

                    addMarker(obj,i);
                    if(i+1>=data.list.length){
                        //移动地图位置
                        map.panTo(new BMap.Point(obj.p015,obj.p014))
                    }
                }
            }else{
                alert("读取失败");
            }
        },
        error : function() {
            // view("异常！");
            alert("异常！");
        }
    });
//
//  //  map.centerAndZoom(point, 15);

//    // 随机向地图添加25个标注
//    var bounds = map.getBounds();
//    var sw = bounds.getSouthWest();
//    var ne = bounds.getNorthEast();
//    var lngSpan = Math.abs(sw.lng - ne.lng);
//    var latSpan = Math.abs(ne.lat - sw.lat);
//    for (var i = 0; i < 25; i ++) {
//        var point = new BMap.Point(sw.lng + lngSpan * (Math.random() * 0.7), ne.lat - latSpan * (Math.random() * 0.7));
//        addMarker(point);
//    }

function  rygjMap(){
    alert($("#dtm_time").val());
}
</script>

</html>