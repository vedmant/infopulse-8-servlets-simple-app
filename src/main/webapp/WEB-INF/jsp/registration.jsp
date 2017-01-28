<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp" %>

<div class="container">
    <h2>Regisration</h2>

    <div class="row">
        <div class="col-sm-6 col-sm-push-3">
            <form action="./registration" class="form-horizontal" method="post">

                <div class="form-group">
                    <label class="col-sm-3 control-label">Name</label>
                    <div class="col-sm-9">
                        <input type="text" name="name" placeholder="Login" class="form-control" autofocus>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Login</label>
                    <div class="col-sm-9">
                        <input type="text" name="login" placeholder="Login" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label">Password</label>
                    <div class="col-sm-9">
                        <input type="password" name="password" placeholder="Login" class="form-control">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label"></label>
                    <div class="col-sm-9">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>

            </form>

        </div>
    </div>
</div>

<%@include file="footer.jsp" %>