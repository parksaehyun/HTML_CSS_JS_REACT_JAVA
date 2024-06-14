<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<h1>게시글 목록</h1>
<ul>
    <c:forEach var="item" items="${items}">
        <li>
            ${item.getSubject()} / ${item.poster} / ${item.regDt}
            <div>
                index: ${status.index} / count : ${status.count} /
                first: ${status.first} / last: ${status.last} /
                current: ${status.current}
            </div>
        </li>
    </c:forEach>
</ul>