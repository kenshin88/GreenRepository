<%@ taglib uri="underground/html" prefix="html" %>
<%@ taglib uri="underground/logic" prefix="logic" %>
<%@ taglib uri="underground/nested" prefix="nested" %>
<%@ taglib uri="underground/bean" prefix="bean" %>
<div class="container">
    <form action="/<bean:message bundle="globalMsg" key="web.application.context"/>/createUser.do"
          method="post" autocomplete="off">
        <input type="hidden" name="token" id="token" value="<bean:write name='userForm' property="token"/>" />
        <fieldset>
            <legend>Create new account</legend>
            <div class="form-group">
                <label for="username">User Name</label>
                <input type="text" class="form-control" id="username" name="user.username"
                       placeholder="Enter User Name">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="user.password"
                       placeholder="Password">
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword"
                       placeholder="Confirm Password">
            </div>
            <div class="form-group">
                <label for="firstName">First Name</label>
                <input type="text" class="form-control" id="firstName" name="user.firstname"
                       placeholder="Enter First Name">
            </div>

            <div class="form-group">
                <label for="lastName">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="user.lastname"
                       placeholder="Enter Last Name">
            </div>

            <div class="form-group">
                <label for="email">Email address</label>
                <input type="text" class="form-control" id="email" name="user.email"
                       placeholder="Enter Email Address">
            </div>
            <div class="form-group">
                <label for="phone">Phone</label>
                <input type="text" class="form-control" id="phone" name="user.phone"
                       placeholder="Enter Phone">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </fieldset>
    </form>
</div> <!-- /container -->