<%@ taglib uri="underground/html" prefix="html" %>
<%@ taglib uri="underground/logic" prefix="logic" %>
<%@ taglib uri="underground/nested" prefix="nested" %>
<%@ taglib uri="underground/bean" prefix="bean" %>
<div class="container">
    <form action="/<bean:message bundle="globalMsg" key="web.application.context"/>/createUser.do" method="post">
        <input type="hidden" name="token" id="token" value="<bean:write name='userForm' property="token"/>" />
        <fieldset>
            <legend>Create new account</legend>
            <div class="form-group">
                <label for="username">User Name</label>
                <input type="text" class="form-control" id="username" placeholder="Enter User Name">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" placeholder="Password">
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" placeholder="Confirm Password">
            </div>
            <div class="form-group">
                <label for="firstName">First Name</label>
                <input type="text" class="form-control" id="firstName" placeholder="Enter First Name">
            </div>

            <div class="form-group">
                <label for="lastName">Last Name</label>
                <input type="text" class="form-control" id="lastName" placeholder="Enter Last Name">
            </div>

            <div class="form-group">
                <label for="email">Email address</label>
                <input type="text" class="form-control" id="email" placeholder="Enter Email Address">
            </div>
            <div class="form-group">
                <label for="phone">Phone</label>
                <input type="text" class="form-control" id="phone" placeholder="Enter Phone">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </fieldset>
    </form>
</div> <!-- /container -->