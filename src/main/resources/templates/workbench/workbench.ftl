<!DOCTYPE html>
<html>
<head>
    <base href=" ${basepath}">
    <meta name="viewport" content="width=device-width" />
    <title>工作台</title>
    <link href="js/plugins/FormbuildVnc/Public/js/formbuild/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="css/saixuan.css" rel="stylesheet">


</head>
<body style="background-color:#fafafa">
<div class="filtrate-wrapper" >
<div class="row-fluid">
    <div class="span12">
        <div id="main" style="width: 100%;height:400px;"></div>
    </div>
</div>
</div>
<div class="filtrate-wrapper" >
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div style="align-content: center;width: 300px" ><h3 style="align-content: center">最大污染设备</h3></div>
                <div class="row-fluid">

                    <div class="span4">
                        <div id="ymain1" style="height:250px;"></div>
                    </div>
                    <div class="span4">
                        <div id="ymain2" style="height:250px;"></div>
                    </div>
                    <div class="span4">
                        <div id="ymain3" style="height:250px;"></div>
                    </div>
                </div>


            </div>
        </div>
    </div>
</div>

<div class="filtrate-wrapper" >
<div class="row-fluid">
    <div class="span6">
        <div id="bing1" style="width: 100%;height:400px;"></div>
    </div>
    <div class="span6">
        <div id="bing2" style="width: 100%;height:600px;"></div>
    </div>
</div>
</div>
</body>
<#include "/public_js.ftl" >
<script src="js/plugins/echarts/echarts.min.js"></script>
<script type="text/javascript">

    $(function ($) {
        // 基于准备好的dom，初始化柱状图echarts实例
        var myChart2 = echarts.init(document.getElementById('main'));
        option = {
            title : {
                text: '设备环境指标',
                subtext: '一次10个设备'
            },
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['PM2.5','PM10','PM100']
            },
            toolbox: {
                show : true,
                feature : {
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : [
                {
                    type : 'category',
                    data : ['设备1','设备2','设备3','设备4','设备5','设备6','设备7','设备8','设备9','设备10']
                }
            ],
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : [
                {
                    name:'PM2.5',
                    type:'bar',
                    data:[2.0, 4.9, 7.0, 23.2, 25.6, 76.7, 135.6, 162.2, 32.6, 20.0],
                    markPoint : {
                        data : [
                            {type : 'max', name: '最大值'},
                            {type : 'min', name: '最小值'}
                        ]
                    },
                    markLine : {
                        data : [
                            {yAxis: '40', label:{normal:{show:true}}, name: 'PM2.5污染极限'}
                         ]
                    }
                },
                {
                    name:'PM10',
                    type:'bar',
                    data:[2.6, 5.9, 9.0, 26.4, 28.7, 70.7, 175.6, 182.2, 48.7, 18.8],
                    markPoint : {
                        data : [
                            {type : 'max', name: '最大值'},
                            {type : 'min', name: '最小值'}
                        ]
                    },
                    markLine : {
                        data : [
                            {yAxis: '60', label:{normal:{show:true}}, name: 'PM10污染极限'}
                        ]
                    }
                },
                {
                    name:'PM100',
                    type:'bar',
                    data:[4.6, 3.9, 5.0, 20.4, 28.7, 70.7, 175.6, 182.2, 48.7],
                    markPoint : {
                        data : [
                            {name : '最高', value : 111.2, xAxis: 7, yAxis: 221},
                            {name : '最低', value : 4.3, xAxis: 51, yAxis: 12}
                        ]
                    },
                    markLine : {
                        data : [
                            {yAxis: '50', label:{normal:{show:true}}, name: 'PM100污染极限'}
                        ]
                    }
                }
            ]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart2.setOption(option);







//仪表1
        var  optiony1 = {
            tooltip : {
                formatter: "{a} <br/>{b} : {c}"
            },
//            toolbox: {
//                feature: {
//                    restore: {},
//                    saveAsImage: {}
//                }
//            },
            series: [
                {
                    name: '最大PM2.5值',
                    type: 'gauge',
                    max: 150,
                    radius: '100%',
                    detail: {formatter:'{value}'},
                    axisLine: {            // 坐标轴线
                        lineStyle: {       // 属性lineStyle控制线条样式
                            color: [[0.3, '#91c7af'],[0.6, '#62879f'],[1, '#c33430']],
                            //width: 2,
                            shadowColor : '#fff', //默认透明
                            shadowBlur: 10
                        }
                    },
                    data: [{value: 89, name: '设备编号:002'}]
                }
            ]
        };

        //仪表2
        var  optiony2 = {
            tooltip : {
                formatter: "{a} <br/>{b} : {c}"
            },
//            toolbox: {
//                feature: {
//                    restore: {},
//                    saveAsImage: {}
//                }
//            },
            series: [
                {
                    name: '最大PM10值',
                    type: 'gauge',
                    padding: [2, 2],
                   radius: '100%',
                    max: 300,
                    detail: {formatter:'{value}'},
                    axisLine: {            // 坐标轴线
                        lineStyle: {       // 属性lineStyle控制线条样式
                            color: [[0.2, '#91c7af'],[0.5, '#62879f'],[1, '#c33430']],
                            //width: 2,
                            shadowColor : '#fff', //默认透明
                            shadowBlur: 10
                        }
                    }  ,
                    data: [{value: 220, name: '设备编号:004'}]
                }
            ]
        };

        //仪表3
        var  optiony3 = {
            tooltip : {
                formatter: "{a} <br/>{b} : {c}"
            },
//            toolbox: {
//                feature: {
//                    restore: {},
//                    saveAsImage: {}
//                }
//            },
            series: [
                {
                    name: '最大PM100值',
                    type: 'gauge',
                    max: 400,
                    radius: '100%',
                    detail: {formatter:'{value}'},
                    axisLine: {            // 坐标轴线
                        lineStyle: {       // 属性lineStyle控制线条样式
                            color: [[0.4, '#91c7af'],[0.7, '#62879f'],[1, '#c33430']],
                            //width: 2,
                            shadowColor : '#fff', //默认透明
                            shadowBlur: 10
                        }
                    },
                    data: [{value: 260, name: '设备编号:006'}]
                }
            ]
        };
        var ymain1 = echarts.init(document.getElementById('ymain1'));
        var ymain2 = echarts.init(document.getElementById('ymain2'));
        var ymain3 = echarts.init(document.getElementById('ymain3'));
        ymain1.setOption(optiony1);
        ymain2.setOption(optiony2);
        ymain3.setOption(optiony3);





//饼状图1
        var bingoption1 = {
            title : {
                text: '超标设备',
                subtext: '设备数量(1283台)',
                x:'center'
            },
            tooltip : {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: ['正常设备','PM2.5超标设备','PM10超标设备','PM100超标设备']
            },
            series : [
                {
                    name: '超标设备',
                    type: 'pie',
                    radius : '55%',
                    center: ['50%', '60%'],
                    data:[
                        {value:1183, name:'正常设备'} ,
                        {value:335, name:'PM2.5超标设备'},
                        {value:310, name:'PM10超标设备'},
                        {value:234, name:'PM100超标设备'}

                    ],
                    itemStyle: {
                        emphasis: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                  //  ,color: ['rgb(254,67,101)','rgb(252,157,154)','rgb(249,205,173)','rgb(200,200,169)','rgb(131,175,155)']
                }
            ]
        };
        var bing1 = echarts.init(document.getElementById('bing1'));
        bing1.setOption(bingoption1);






        var cellSize = [80, 80];
        var pieRadius = 30;

        function getVirtulData() {
            var date = +echarts.number.parseDate('2017-02-01');
            var end = +echarts.number.parseDate('2017-03-01');
            var dayTime = 3600 * 24 * 1000;
            var data = [];
            for (var time = date; time < end; time += dayTime) {
                data.push([
                    echarts.format.formatTime('yyyy-MM-dd', time),
                    Math.floor(Math.random() * 10000)
                ]);
            }
            return data;
        }

        function getPieSeries(scatterData, chart) {
            return echarts.util.map(scatterData, function (item, index) {
                var center = chart.convertToPixel('calendar', item);
                return {
                    id: index + 'pie',
                    type: 'pie',
                    center: center,
                    label: {
                        normal: {
                            formatter: '{c}',
                            position: 'inside'
                        }
                    },
                    radius: pieRadius,
                    data: [
                        {name: 'PM2.5超', value: Math.round(Math.random() * 1000)},
                        {name: 'PM10超', value: Math.round(Math.random() * 1000)},
                        {name: 'PM100超', value: Math.round(Math.random() * 1000)},
                        {name: '正常', value: 1180}
                    ]
                };
            });
        }

        function getPieSeriesUpdate(scatterData, chart) {
            return echarts.util.map(scatterData, function (item, index) {
                var center = chart.convertToPixel('calendar', item);
                return {
                    id: index + 'pie',
                    center: center
                };
            });
        }

        var scatterData = getVirtulData();
        var app = echarts.init(document.getElementById('bing2'));
        bingoption = {
            tooltip : {},
            legend: {
                data: ['PM2.5超', 'PM10超', 'PM100超','正常'],
                bottom: 20
            },
            calendar: {
                top: 'middle',
                left: 'center',
                orient: 'vertical',
                cellSize: cellSize,
                yearLabel: {
                    show: false,
                    textStyle: {
                        fontSize: 30
                    }
                },
                dayLabel: {
                    margin: 20,
                    firstDay: 1,
                    nameMap: ['周日', '周一', '周二', '周三', '周四', '周五', '周六']
                },
                monthLabel: {
                    show: false
                },
                range: ['2017-02']
            },
            series: [{
                id: 'label',
                type: 'scatter',
                coordinateSystem: 'calendar',
                symbolSize: 1,
                label: {
                    normal: {
                        show: true,
                        formatter: function (params) {
                            return echarts.format.formatTime('dd', params.value[0]);
                        },
                        offset: [-cellSize[0] / 2 + 10, -cellSize[1] / 2 + 10],
                        textStyle: {
                            color: '#000',
                            fontSize: 14
                        }
                    }
                },
                data: scatterData
            }]
        };
app.setOption(bingoption);
        var myChart = echarts.init(document.getElementById('bing2'));
        if (!app.inNode) {
            var pieInitialized;
            setTimeout(function () {
                pieInitialized = true;
                myChart.setOption({
                    series: getPieSeries(scatterData, myChart)
                });
            }, 10);

            app.onresize = function () {
                if (pieInitialized) {
                    myChart.setOption({
                        series: getPieSeriesUpdate(scatterData, myChart)
                    });
                }
            };
        }

    });




</script>
</html>