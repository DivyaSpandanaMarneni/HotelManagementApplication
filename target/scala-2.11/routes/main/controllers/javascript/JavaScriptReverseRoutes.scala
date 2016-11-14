
// @GENERATOR:play-routes-compiler
// @SOURCE:V:/HotelManagementApplication/conf/routes
// @DATE:Wed Aug 03 00:01:48 EDT 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:22
  class ReverseGuestPreferences(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def GuestPreferenceRedirect: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GuestPreferences.GuestPreferenceRedirect",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "confirmation"})
        }
      """
    )
  
    // @LINE:24
    def GuestRoomAllocation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.GuestPreferences.GuestRoomAllocation",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "GuestDetails"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAdminRoomTypeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def addNewRoomType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminRoomTypeController.addNewRoomType",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "AddRoomType"})
        }
      """
    )
  
    // @LINE:36
    def createRoom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminRoomTypeController.createRoom",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "NewRoom"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:32
  class ReverseAdminRoomController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def createRoom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminRoomController.createRoom",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CreateRoom"})
        }
      """
    )
  
    // @LINE:32
    def addRoomButton: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminRoomController.addRoomButton",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "AddRoom"})
        }
      """
    )
  
  }

  // @LINE:28
  class ReverseAdminHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:48
    def checkAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminHomeController.checkAdmin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "CheckAdmin"})
        }
      """
    )
  
    // @LINE:28
    def adminRedirect: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminHomeController.adminRedirect",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:20
    def formData: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.formData",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "homePage"})
        }
      """
    )
  
    // @LINE:12
    def guestPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.guestPage",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
        }
      """
    )
  
  }

  // @LINE:42
  class ReverseRedirectionController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:60
    def redirectBookingStatus: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectBookingStatus",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "BookingStatus"})
        }
      """
    )
  
    // @LINE:46
    def redirectAdmin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectAdmin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Admin"})
        }
      """
    )
  
    // @LINE:56
    def redirectAdminAddRoomType: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectAdminAddRoomType",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "AdminRoomTypes"})
        }
      """
    )
  
    // @LINE:53
    def redirectAdminAddRoom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectAdminAddRoom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "AdminRooms"})
        }
      """
    )
  
    // @LINE:50
    def redirectAdminWaiter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectAdminWaiter",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "AdminAddWaiter"})
        }
      """
    )
  
    // @LINE:42
    def redirectHome: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectHome",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Home"})
        }
      """
    )
  
    // @LINE:58
    def redirectBookRoom: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectBookRoom",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "GuestBookRoom"})
        }
      """
    )
  
    // @LINE:44
    def redirectGuest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RedirectionController.redirectGuest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Guest"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }

  // @LINE:30
  class ReverseAssignWaiterController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def updateRoomWaiter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AssignWaiterController.updateRoomWaiter",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "AssignWaiter"})
        }
      """
    )
  
  }


}
