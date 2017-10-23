<!DOCTYPE html>
<html>
<head>
    <base href=" ${basepath}">
    <meta name="viewport" content="width=device-width" />
    <title>历史查询</title>
<#include "/public_css.ftl" >
</head>
<body style="background-color:#fafafa">
<div class="filtrate-wrapper" style="padding-bottom:0px;">
    <div class="panel panel-default">
        <div class="panel-heading">查询条件</div>
        <div class="panel-body">
            <form id="formSearch" class="form-horizontal">
                <div class="form-group" style="margin-top:15px">
                    <label class="control-label col-sm-1" for="txt_search_departmentname">数据时间</label>
                    <div class="col-sm-3" id="date">
                        <input type="text" class="form-control" id="txt_search_departmentname">
                    </div>
                    <#--<label class="control-label col-sm-1" for="txt_search_statu">状态</label>-->
                    <#--<div class="col-sm-3">-->
                        <#--<input type="text" class="form-control" id="txt_search_statu">-->
                    <#--</div>-->
                    <div class="col-sm-4" style="text-align:left;">
                        <button type="button" style="margin-left:50px" id="btn_query" class="btn btn-primary">查询</button>
                        <button type="button"  id="btn_export" class="btn btn-primary">导出</button>
                     </div>

                </div>
            </form>
        </div>
    </div>

    <#--<div id="toolbar" class="btn-group">-->
        <#--<button id="btn_add" type="button" class="btn btn-default">-->
            <#--<span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增-->
        <#--</button>-->
        <#--<button id="btn_edit" type="button" class="btn btn-default">-->
            <#--<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>修改-->
        <#--</button>-->
        <#--<button id="btn_delete" type="button" class="btn btn-default">-->
            <#--<span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除-->
        <#--</button>-->
    <#--</div>-->
    <table id="tb_departments"></table>
</div>
</body>
<#include "/public_js.ftl" >
<script type="text/javascript" src="js/necomponent/create_formobj.js"></script>
<script type="text/javascript">
    var queryParams={
    };
    var exportParam=null;
    // 得到查询的参数
     var queryParamsfunction = function(params) {
         queryParams.limit=params.limit;
         queryParams.offset=params.offset;
        var temp = queryParams;
        return temp;
    };
    $(function ($) {
        //初始化日期组件
        getdaterangepicker("txt_search_departmentname");

        $("#tb_departments").bootstrapTable({
            // url: 'newleave/queryleaveData_test.htm', //请求后台的URL（*）
            classes:'table table-hover table-no-bordered',//设置表头的样式
            method : 'get', // 请求方式（*）
            //  toolbar: '#toolbar', //工具按钮用哪个容器
            striped : true, // 是否显示行间隔色
            cache : false, // 是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination : true, // 是否显示分页（*）
            sortable : true, // 是否启用排序
            sortOrder : "asc", // 排序方式
            // classes:'table table-hover table-no-bordered',
            queryParams :queryParamsfunction,// 传递参数（*）
            sidePagination : "server", // 分页方式：client客户端分页，server服务端分页（*）
            pageNumber : 1, // 初始化加载第一页，默认第一页
            pageSize : 10, // 每页的记录行数（*）
            pageList : [ 10, 25, 50, 100 ], // 可供选择的每页的行数（*）
            search : false, // 是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            //	strictSearch : true,
            showColumns : true, // 是否显示所有的列
            //	showExportbtn:true, //是否有导出按钮 导出按钮id =exportbtn   默认false 源码扩展开发
            showColumnsStyle:true,//是否使用列展示查看选择按钮 下移改变样式  默认false 源码扩展开发
            showLoadSuccessAlert:true,//是否表格查询后 输出查询结果的提示框  默认true  源码扩展开发
            //,启用点击行弹出按钮层   1.tableid 2.基本查询层.   3.按钮层divid   源码扩展开发
            //showClickRowDIV:["bfsptable1","select_div","toolbar"],
            showRefresh : false, // 是否显示刷新按钮
            minimumCountColumns : 2, // 最少允许的列数
            clickToSelect : true, // 是否启用点击选中行
            // height : 500, // 行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId : "v_equipment_name", // 每一行的唯一标识，一般为主键列
            //	showToggle : true, // 是否显示详细视图和列表视图的切换按钮
            //cardView : false, // 是否显示详细视图

            detailView : true, // 是否显示父子表
            detailFormatter:function(index, row){//展开详情的重写排序事件

                //return index+" "+row.v_qy_num;
            },
            fixedColumns: true,//冻结列 开启
            fixedNumber:4, //冻结几列数据 隐藏数据也包括
            // striped:true,隔行变色
            columns : [ {
                checkbox : true
            }, {
                field : 'v_equipment_name',
                title : '设备编号'
            }, {
                field : 'p001',
                title : '传感器状态'
            }, {
                field : 'p002',
                title : 'PM2.5'
            }, {
                field : 'p003',
                title : 'PM10'
            }, {
                field : 'p004',
                title : '风速'

            }, {
                field : 'p005',
                title : '风向'
            }, {
                field : 'p006',
                title : '温度'
            }, {
                field : 'p007',
                title : '湿度'
            }, {
                field : 'p008',
                title : '噪音'
            }, {
                field : 'p009',
                title : 'PM100'
            }, {
                field : 'p010',
                title : '气压'
            }, {
                field : 'p011',
                title : '风级'
            }, {
                field : 'dtm_create',
                title : '数据插入时间'
            }

            ]
        });
       $("#btn_export").click(function() {
           if(exportParam!=null){
               var url="Equipment_data/SEquipment_dateExport.htm?"+exportParam;
               var url2="Equipment_data/exportTag.htm?"+exportParam;
               bsuExport(url,url2,$("#btn_export"));
           }else{
               layer.msg('请先查询出您想要的结果!');
           }
        });

        $("#btn_query").click(function() {
            var date= $("#txt_search_departmentname").val();

              queryParams={
                date:date
            };
            exportParam=parseParam(queryParams);
            //查询加载表格
            $('#tb_departments').bootstrapTable('refresh', {
                url: 'Equipment_data/SEquipment_dateList.htm',
                silent: true,
                query: queryParams
            });

        });
    });


</script>
</html>