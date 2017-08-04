<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
			
			
			<!-- 专家类别下拉列表 -->
			
			<div class="dropdown">
				<button class="btn dropdown-toggle" data-toggle="dropdown"> 专家类别</button>
				<ul class="dropdown-menu" >
				<c:forEach items="${professorClasses}" var="pc">
					<li><a role="menuitem" tabindex="-1" href="javascript:;" onclick="getModalData('${pc.code}',1)">${pc.professional}</a></li>
				</c:forEach>
				</ul>
			</div>
			<!-- end -->
			<!-- 专家列表 -->
 				<div class="row" ><p/>
       				<div class="col-md-12 col-sm-12 col-xs-12">
            			<div class="panel panel-default">
                		<div class="panel-body">
                    <div class="table-responsive">
                        <table class="table table-bordered table-hover" id="dataTables-example">
                            <thead>
                            <tr>
                                <th>#</th>
                                <th>选择</th>
                                <th>专家姓名</th>
                                <th>专业</th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${professors}" var="professor" varStatus="status">
                            <tr>
                                <td>${status.index+1 }</td>
                                <td><input type="checkbox" ${professor.getIn(spList) ? "checked='checked'" : "" }   value="${professor.professionalId}" onclick="selectCheckBox(event)"></td>
                                <td>${professor.name }</td>
                                <td>${professor.className }</td>
	                        </tr>
	                        </c:forEach>
	                        </tbody>
		                     </table>
		                    </div>
		                </div>
		            </div>
		        </div>
		    </div>
		    <div class="row">
		        <div class="col-sm-6"></div>
		        <div class="col-sm-6">
		            <nav aria-label="Page navigation">
		                <ul id="modal_bottom_page"  class="pagination">
		                </ul>
		            </nav>
		        </div>
		    </div>
<script type="text/javascript">
$(function(){
    test("1", function(){
        var element = $('#modal_bottom_page');
        var options = {
            bootstrapMajorVersion:3,
            currentPage: ${modalPageInfo.pageNum},
            numberOfPages: ${modalPageInfo.pageSize},
            totalPages:${modalPageInfo.pages},
            shouldShowPage:true,//是否显示该按钮
            //点击事件
            onPageClicked: function (event, originalEvent, type, page) {
            	//发送ajax请求，更新模态框中的页面数据
            	getModalData('${code}', page);
            }
        }
        element.bootstrapPaginator(options);
    })
});
</script>
</body>
</html>
