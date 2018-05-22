<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path =request.getContextPath();
    String basepath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品管理</title>
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="css/common.css"/>

</head>
<body>
<nav class="homepage">首页
    <span class="classic">&gt;</span> 产品列表
    <a class="button btn-succeed" style="line-height:1.6em;margin-top:3px" href="back_GoodsManage.action" title="刷新"><i class="Hui-iconfont"></i></a>
</nav>
<div class="catalog">
    <table class="table">
        <tbody>
        <tr>
            <td class="va-t">

                <ul class="ztree">
                    <c:forEach items="${ listGoodsClass}" var ="goodsclass">
                        <li><a href="back_showGoodsByClass.action?goodsClass=${goodsclass.classmodel }&goodsChildClass='XXXAXXX'">${goodsclass.classmodel }</a>
                            <ul class="detail">
                                <c:forEach items="${ listGoodsChildClass}" var ="goodsChildClass">
                                    <li><a  href="back_showGoodsByClass.action?goodsClass=${goodsclass.classmodel }&goodsChildClass=${goodsChildClass.classbrand }">${goodsChildClass.classbrand }</a></li>
                                </c:forEach>
                            </ul>
                        </li>
                    </c:forEach>
                </ul>

            </td>
        </tr>
        </tbody>
    </table>
</div>


<div class="insert">
    <div class="page-container">
        <div class="text-c"></div>
        <div class="DeAndData">
            <span class="delete"></span>
		<!-- 	<a href="javascript:;" onclick="datadel()" class="btn">批量删除</a></span>  -->
		<span class="dataAll">共有数据：<strong>${sumlist }</strong> 条</span>
        </div>
        <div class="MidBody">
            <div id="DataTables" class="dataTables_footer">
                <div class="dataTables_length" id="DataTables_length">
                    <!-- <label>显示
                        <select name="DataTables_length" aria-controls="DataTables" class="select">
                            <option value="10">10</option>
                        </select>条
                    </label> -->
                </div>
                <div id="DataTables" class="dataTables_filter">
                    <!-- <label>从当前数据中检索:
                        <input type="search" class="input-text " aria-controls="DataTables">
                    </label> -->
                </div>
                <table class="tables" id="DataTables" role="grid" aria-describedby="DataTables_info">
                    <thead>
                    <tr class="text-c" role="row">
                        <!-- <th class="sorting" style="width: 10%;"><input type="checkbox" name="" value=""></th> -->
                        <th class="sorting" aria-label="菜品编码" style="width: 10%;">菜品编码</th>
                        <th class="sorting" aria-label="菜品名称" style="width:10%;">菜品名称</th>
                        <th class="sorting" aria-label="价格" style="width:10%;">价格</th>
                        <th class="sorting" aria-label="库存数量" style="width: 10%;">库存数量</th>
                        <th class="sorting" aria-label="操作" style="width:20%;">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${ listGoodsinfo}" var="goodsInfo">
                        <tr class="text-c" role="row">
                            <!-- <td class="box"><input name="" type="checkbox" value=""></td> -->
                            <td class="box">${goodsInfo.goodsid }</td>
                            <td class="box">${goodsInfo.goodsname }</td>
                            <td class="box">${goodsInfo.goodsprice }</td>
                            <td class="box">${goodsInfo.goodsnum }</td>
                            <td class="box">
                                <a style="text-decoration:none;color:#009;" href="ToEditGoodsinfo.action?goodsid=${goodsInfo.goodsid }" title="编辑"><i class="Hui-iconfont"></i></a>
                                <a style="text-decoration:none;color:#333;" href="DodeleteGoodsinfo.action?goodsid=${goodsInfo.goodsid }" title="删除"><i class="Hui-iconfont"></i></a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="dataTables_info" id="DataTables_info" role="status" aria-live="polite">显示 1 到 1 ，共 1 条
                </div>
                <div class="dataTables_paginate paging_numbers" id="DataTables_paginate">
                    <a class="button previous" aria-controls="DataTables" data-dt-idx="0" tabindex="0" id="DataTables_previous">上一页
                    </a>
                    <span>
				<a class="button current" aria-controls="DataTables" data-dt-idx="1" tabindex="0">1</a>
			</span>
                    <a class="button next" aria-controls="DataTables" data-dt-idx="2" tabindex="0" id="DataTables_next">下一页
                    </a>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="../jquery-3.2.1/jquery-3.2.1.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
    $(function () {
        $(".ztree>li>a").click(function () {
            $(this).next(".detail").toggle("1s");
        });
    });
</script>

</body>
</html>