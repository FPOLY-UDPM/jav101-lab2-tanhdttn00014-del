<%@page pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<body>
<form action="${pageContext.request.contextPath}/form/update" method="post">

    <div>
        Fullname: <input type="text" name="fullname" value="${user.fullname}" ${editabled ? 'readonly' : ''} />
    </div>

    <div>
        Gender:
        <input type="radio" name="gender" value="true" ${user.gender ? 'checked' : ''} /> Male
        <input type="radio" name="gender" value="false" ${!user.gender ? 'checked' : ''} /> Female
    </div>

    <div>
        Country:
        <select name="country">
            <option value="VN" ${user.country == 'VN' ? 'selected' : ''}>Việt Nam</option>
            <option value="US" ${user.country == 'US' ? 'selected' : ''}>United States</option>
            <option value="CN" ${user.country == 'CN' ? 'selected' : ''}>China</option>
        </select>
    </div>

    <div>
        <button type="submit" ${editabled ? 'disabled' : ''}>Create</button>
        <button type="submit">Update</button>
    </div>

</form>
</body>
</html>