<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>

<form action="reviewSubject.html" method="post" id="reviewSubjectForm">
	<input name="subjectId" value="${subject.subjectId}" type="hidden" />
	<fieldset disabled>
		<div class="form-group">
			<label for="disabledTextInput">课题名称</label> <input type="text"
				id="disabledTextInput" class="form-control"
				placeholder="${subject.subjectName}">
		</div>
		<div class="form-group">
			<label for="disabledTextInput">申请人</label> <input type="text"
				id="disabledTextInput" class="form-control"
				placeholder="${subject.userName }">
		</div>
		<div class="form-group">
			<label for="disabledTextInput">所属机构</label> <input type="text"
				id="disabledTextInput" class="form-control"
				placeholder="${org.orgnaizationName}">
		</div>
		<div class="form-group">
			<label for="disabledTextInput">课题附件<a
				href='${subject.subjectFile}'>下载</a></label>
		</div>
	</fieldset>
	<div class="form-group">
		<label for="disabledTextInput">评分（1-5分，5分最高）</label>
		<div class="radio">
			<label> <input type="radio" name="score" id="optionsRadios1"
				value="1">1分</>
			</label>
		</div>
		<div class="radio">
			<label> <input type="radio" name="score" id="optionsRadios2"
				value="2">2分</>
			</label>
		</div>
		<div class="radio">
			<label> <input type="radio" name="score" id="optionsRadios3"
				value="3">3分</>
			</label>
		</div>
		<div class="radio">
			<label> <input type="radio" name="score" id="optionsRadios4"
				value="4">4分</>
			</label>
		</div>
		<div class="radio">
			<label> <input type="radio" name="score" id="optionsRadios5"
				value="5">5分</>
			</label>
		</div>
	</div>
	<div class="form-group">
		<label for="textInput">建议</label>
		<textarea class="form-control" rows="5" name="suggest"></textarea>
	</div>
</form>