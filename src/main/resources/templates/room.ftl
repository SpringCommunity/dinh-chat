<!DOCTYPE html>
<html ng-app="indexApp">
<head>
  <meta charset="utf-8">
  <title>Ng-chat Application :: Dinh Duc Thinh</title>
  <meta name="viewport" content="width=device-width">
  <#include "includes/libs.ftl">
  <script src="js/app.js"></script>
  <script src="js/controllers.js"></script>
</head>
<body class="bg-secondary" ng-controller="IndexController">
<!-- header -->
<#include "includes/header.ftl">
<!-- body -->
<div class="body-div">
   <div class="container">
        <div class="row text-center">
             <div class="col-sm-3 hidden-xs"><!-- NO CONTENT --></div>
             <!-- Log chat -->
             <div class="col-sm-6 col-xs-12">
                 <h3>Welcome to ${ room.roomName } room!</h3>
                 <table class="table">
                     <tr><td></td></tr>
                 </table>
             </div>
             <div class="col-sm-3 hidden-xs"><!-- NO CONTENT --></div>
        </div><!-- row -->
        <div class="row text-center">
             <div class="col-sm-3 hidden-xs"><!-- NO CONTENT --></div>
             <!-- Log chat -->
             <div class="col-sm-6 col-xs-12">
                 <textarea class="form-control" cols="5" rows="2" placeholder="Starting chat by saying something"></textarea>
             </div>
             <div class="col-sm-3 hidden-xs"><!-- NO CONTENT --></div>
        </div><!-- row -->
   </div><!--container --> 
</div>
<!-- footer -->
<#include "includes/footer.ftl">
<#include "includes/js.ftl">
</body>
</html>