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
             <div class="col-sm-4 hidden-xs"><!--NO CONTENT HERE--></div>
              <!-- main -->
              <div class="col-sm-4 col-xs-12">
                  <!-- search form -->
                  <div class="col-lg-12">
                      <div class="input-group">
                          <label class="control-label text-left">Keyword is: <b>{{ keyword }}</b></label>
                      </div>
					  <div class="input-group">
					    <input type="text" class="form-control" placeholder="Search a room chat" ng-model="keyword" />
					    <span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>
					  </div>
				  </div><!-- /.col-lg-12 -->
				  <!-- List of room -->
				  <div class="col-lg-12">
				       <ul class="list-group" ng-repeat="room in rooms | filter : keyword | orderBy :'roomName.typeName'">
				       <a href="{{ 'room/' + room.roomId }}">
							  <li class="list-group-item">
							      <div class="row">
							         <!-- room icon -->
							         <div class="col-lg-4">
							              <img ng-src="{{ room.roomIcon }}" />
							         </div><!-- col-lg-4 -->
							         <!-- room name -->
							         <div class="col-lg-8 room-name">
								          <h3>{{ room.roomName | uppercase }}</h3>					               
							         </div><!-- col-lg-8 -->
							         <div class="col-lg-12" ng-if="keyword">
							              <i>{{ room.roomDetails }}</i>
							         </div>
							      </div><!-- row -->
							  </li>
						  </a>
					    </ul>
				  </div>
              </div>
              <div class="col-sm-4 hidden-xs"><!--NO CONTENT HERE--></div>
        </div><!-- row -->
   </div><!--container --> 
</div>
<!-- footer -->
<#include "includes/footer.ftl">
<#include "includes/js.ftl">
</body>
</html>