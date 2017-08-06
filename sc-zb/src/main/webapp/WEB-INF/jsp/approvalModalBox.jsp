<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>


<!-- 专家列表 -->
<div class="row">
	<div class="col-md-12 col-sm-12 col-xs-12">
		<div class="panel panel-default">
			<div class="panel-body">
				<div class="table-responsive">
					<table class="table table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>#</th>
								<th>专家姓名</th>
								<th>评分结果</th>
								<th>评分时间</th>
								<th>审核状态</th>
								<th>专家反馈</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${sps}" var="s" varStatus="status">
							<tr>
								<td>${status.index+1}</td>
								<td>${s.professionalName}</td>
								<td>${s.score}</td>
								<td>
									<c:if test="${s.createTime!=null}"> 
										<fmt:formatDate value="${s.createTime}" pattern="yyyy年MM月dd日"/>
									</c:if>
									<c:if test="${s.createTime==null}">
									- 
									</c:if>
								</td>
								<td>${s.reviewed==0 ? "审核中" : "已审核"}</td>
								<td><a href='javascript:;' onclick="getDetail(${s.subjectProfessionalId})">查看</a></td>
							</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="form-group">
	<label for="textInput">专家反馈</label>
	<textarea id="textarea-suggest" class="form-control" rows="5"></textarea>
</div>
<script type="text/javascript">
function getDetail (subjectProfessionalId){
	$.get("getProfessionalSuggest.html", {subjectProfessionalId: subjectProfessionalId}, function(data){
		$("#textarea-suggest").val(data.data);
	},'json');
}
</script>


