
// @GENERATOR:play-routes-compiler
// @SOURCE:V:/HotelManagementApplication/conf/routes
// @DATE:Wed Aug 03 00:01:48 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:10
  HomeController_1: controllers.HomeController,
  // @LINE:13
  CountController_0: controllers.CountController,
  // @LINE:15
  AsyncController_2: controllers.AsyncController,
  // @LINE:18
  Assets_9: controllers.Assets,
  // @LINE:22
  GuestPreferences_6: controllers.GuestPreferences,
  // @LINE:28
  AdminHomeController_7: controllers.AdminHomeController,
  // @LINE:30
  AssignWaiterController_3: controllers.AssignWaiterController,
  // @LINE:32
  AdminRoomController_8: controllers.AdminRoomController,
  // @LINE:34
  AdminRoomTypeController_4: controllers.AdminRoomTypeController,
  // @LINE:42
  RedirectionController_5: controllers.RedirectionController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:10
    HomeController_1: controllers.HomeController,
    // @LINE:13
    CountController_0: controllers.CountController,
    // @LINE:15
    AsyncController_2: controllers.AsyncController,
    // @LINE:18
    Assets_9: controllers.Assets,
    // @LINE:22
    GuestPreferences_6: controllers.GuestPreferences,
    // @LINE:28
    AdminHomeController_7: controllers.AdminHomeController,
    // @LINE:30
    AssignWaiterController_3: controllers.AssignWaiterController,
    // @LINE:32
    AdminRoomController_8: controllers.AdminRoomController,
    // @LINE:34
    AdminRoomTypeController_4: controllers.AdminRoomTypeController,
    // @LINE:42
    RedirectionController_5: controllers.RedirectionController
  ) = this(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_9, GuestPreferences_6, AdminHomeController_7, AssignWaiterController_3, AdminRoomController_8, AdminRoomTypeController_4, RedirectionController_5, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, CountController_0, AsyncController_2, Assets_9, GuestPreferences_6, AdminHomeController_7, AssignWaiterController_3, AdminRoomController_8, AdminRoomTypeController_4, RedirectionController_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """guest""", """controllers.HomeController.guestPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """homePage""", """controllers.HomeController.formData"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """confirmation""", """controllers.GuestPreferences.GuestPreferenceRedirect"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """GuestDetails""", """controllers.GuestPreferences.GuestRoomAllocation"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.AdminHomeController.adminRedirect"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AssignWaiter""", """controllers.AssignWaiterController.updateRoomWaiter"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AddRoom""", """controllers.AdminRoomController.addRoomButton"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AddRoomType""", """controllers.AdminRoomTypeController.addNewRoomType"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """NewRoom""", """controllers.AdminRoomTypeController.createRoom"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CreateRoom""", """controllers.AdminRoomController.createRoom"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Home""", """controllers.RedirectionController.redirectHome"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Guest""", """controllers.RedirectionController.redirectGuest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Admin""", """controllers.RedirectionController.redirectAdmin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """CheckAdmin""", """controllers.AdminHomeController.checkAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AdminAddWaiter""", """controllers.RedirectionController.redirectAdminWaiter"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AdminRooms""", """controllers.RedirectionController.redirectAdminAddRoom"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """AdminRoomTypes""", """controllers.RedirectionController.redirectAdminAddRoomType"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """GuestBookRoom""", """controllers.RedirectionController.redirectBookRoom"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """BookingStatus""", """controllers.RedirectionController.redirectBookingStatus"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:10
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_guestPage1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("guest")))
  )
  private[this] lazy val controllers_HomeController_guestPage1_invoker = createInvoker(
    HomeController_1.guestPage,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "guestPage",
      Nil,
      "POST",
      """ An example controller showing how to use dependency injection""",
      this.prefix + """guest"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_CountController_count2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count2_invoker = createInvoker(
    CountController_0.count,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      """""",
      this.prefix + """count"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_AsyncController_message3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message3_invoker = createInvoker(
    AsyncController_2.message,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      """ An example controller showing how to write asynchronous code""",
      this.prefix + """message"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_formData5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("homePage")))
  )
  private[this] lazy val controllers_HomeController_formData5_invoker = createInvoker(
    HomeController_1.formData,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "formData",
      Nil,
      "POST",
      """""",
      this.prefix + """homePage"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_GuestPreferences_GuestPreferenceRedirect6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("confirmation")))
  )
  private[this] lazy val controllers_GuestPreferences_GuestPreferenceRedirect6_invoker = createInvoker(
    GuestPreferences_6.GuestPreferenceRedirect,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GuestPreferences",
      "GuestPreferenceRedirect",
      Nil,
      "POST",
      """""",
      this.prefix + """confirmation"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_GuestPreferences_GuestRoomAllocation7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("GuestDetails")))
  )
  private[this] lazy val controllers_GuestPreferences_GuestRoomAllocation7_invoker = createInvoker(
    GuestPreferences_6.GuestRoomAllocation,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.GuestPreferences",
      "GuestRoomAllocation",
      Nil,
      "POST",
      """""",
      this.prefix + """GuestDetails"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_AdminHomeController_adminRedirect8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_AdminHomeController_adminRedirect8_invoker = createInvoker(
    AdminHomeController_7.adminRedirect,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminHomeController",
      "adminRedirect",
      Nil,
      "POST",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_AssignWaiterController_updateRoomWaiter9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AssignWaiter")))
  )
  private[this] lazy val controllers_AssignWaiterController_updateRoomWaiter9_invoker = createInvoker(
    AssignWaiterController_3.updateRoomWaiter,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AssignWaiterController",
      "updateRoomWaiter",
      Nil,
      "POST",
      """""",
      this.prefix + """AssignWaiter"""
    )
  )

  // @LINE:32
  private[this] lazy val controllers_AdminRoomController_addRoomButton10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AddRoom")))
  )
  private[this] lazy val controllers_AdminRoomController_addRoomButton10_invoker = createInvoker(
    AdminRoomController_8.addRoomButton,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminRoomController",
      "addRoomButton",
      Nil,
      "POST",
      """""",
      this.prefix + """AddRoom"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_AdminRoomTypeController_addNewRoomType11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AddRoomType")))
  )
  private[this] lazy val controllers_AdminRoomTypeController_addNewRoomType11_invoker = createInvoker(
    AdminRoomTypeController_4.addNewRoomType,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminRoomTypeController",
      "addNewRoomType",
      Nil,
      "POST",
      """""",
      this.prefix + """AddRoomType"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_AdminRoomTypeController_createRoom12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("NewRoom")))
  )
  private[this] lazy val controllers_AdminRoomTypeController_createRoom12_invoker = createInvoker(
    AdminRoomTypeController_4.createRoom,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminRoomTypeController",
      "createRoom",
      Nil,
      "POST",
      """""",
      this.prefix + """NewRoom"""
    )
  )

  // @LINE:39
  private[this] lazy val controllers_AdminRoomController_createRoom13_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CreateRoom")))
  )
  private[this] lazy val controllers_AdminRoomController_createRoom13_invoker = createInvoker(
    AdminRoomController_8.createRoom,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminRoomController",
      "createRoom",
      Nil,
      "POST",
      """""",
      this.prefix + """CreateRoom"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_RedirectionController_redirectHome14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Home")))
  )
  private[this] lazy val controllers_RedirectionController_redirectHome14_invoker = createInvoker(
    RedirectionController_5.redirectHome,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectHome",
      Nil,
      "GET",
      """""",
      this.prefix + """Home"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_RedirectionController_redirectGuest15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Guest")))
  )
  private[this] lazy val controllers_RedirectionController_redirectGuest15_invoker = createInvoker(
    RedirectionController_5.redirectGuest,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectGuest",
      Nil,
      "GET",
      """""",
      this.prefix + """Guest"""
    )
  )

  // @LINE:46
  private[this] lazy val controllers_RedirectionController_redirectAdmin16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Admin")))
  )
  private[this] lazy val controllers_RedirectionController_redirectAdmin16_invoker = createInvoker(
    RedirectionController_5.redirectAdmin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectAdmin",
      Nil,
      "GET",
      """""",
      this.prefix + """Admin"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_AdminHomeController_checkAdmin17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("CheckAdmin")))
  )
  private[this] lazy val controllers_AdminHomeController_checkAdmin17_invoker = createInvoker(
    AdminHomeController_7.checkAdmin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminHomeController",
      "checkAdmin",
      Nil,
      "POST",
      """""",
      this.prefix + """CheckAdmin"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_RedirectionController_redirectAdminWaiter18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AdminAddWaiter")))
  )
  private[this] lazy val controllers_RedirectionController_redirectAdminWaiter18_invoker = createInvoker(
    RedirectionController_5.redirectAdminWaiter,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectAdminWaiter",
      Nil,
      "GET",
      """""",
      this.prefix + """AdminAddWaiter"""
    )
  )

  // @LINE:53
  private[this] lazy val controllers_RedirectionController_redirectAdminAddRoom19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AdminRooms")))
  )
  private[this] lazy val controllers_RedirectionController_redirectAdminAddRoom19_invoker = createInvoker(
    RedirectionController_5.redirectAdminAddRoom,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectAdminAddRoom",
      Nil,
      "GET",
      """""",
      this.prefix + """AdminRooms"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_RedirectionController_redirectAdminAddRoomType20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("AdminRoomTypes")))
  )
  private[this] lazy val controllers_RedirectionController_redirectAdminAddRoomType20_invoker = createInvoker(
    RedirectionController_5.redirectAdminAddRoomType,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectAdminAddRoomType",
      Nil,
      "GET",
      """""",
      this.prefix + """AdminRoomTypes"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_RedirectionController_redirectBookRoom21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("GuestBookRoom")))
  )
  private[this] lazy val controllers_RedirectionController_redirectBookRoom21_invoker = createInvoker(
    RedirectionController_5.redirectBookRoom,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectBookRoom",
      Nil,
      "GET",
      """""",
      this.prefix + """GuestBookRoom"""
    )
  )

  // @LINE:60
  private[this] lazy val controllers_RedirectionController_redirectBookingStatus22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("BookingStatus")))
  )
  private[this] lazy val controllers_RedirectionController_redirectBookingStatus22_invoker = createInvoker(
    RedirectionController_5.redirectBookingStatus,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RedirectionController",
      "redirectBookingStatus",
      Nil,
      "GET",
      """""",
      this.prefix + """BookingStatus"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:10
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index())
      }
  
    // @LINE:12
    case controllers_HomeController_guestPage1_route(params) =>
      call { 
        controllers_HomeController_guestPage1_invoker.call(HomeController_1.guestPage)
      }
  
    // @LINE:13
    case controllers_CountController_count2_route(params) =>
      call { 
        controllers_CountController_count2_invoker.call(CountController_0.count)
      }
  
    // @LINE:15
    case controllers_AsyncController_message3_route(params) =>
      call { 
        controllers_AsyncController_message3_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:18
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_9.versioned(path, file))
      }
  
    // @LINE:20
    case controllers_HomeController_formData5_route(params) =>
      call { 
        controllers_HomeController_formData5_invoker.call(HomeController_1.formData)
      }
  
    // @LINE:22
    case controllers_GuestPreferences_GuestPreferenceRedirect6_route(params) =>
      call { 
        controllers_GuestPreferences_GuestPreferenceRedirect6_invoker.call(GuestPreferences_6.GuestPreferenceRedirect)
      }
  
    // @LINE:24
    case controllers_GuestPreferences_GuestRoomAllocation7_route(params) =>
      call { 
        controllers_GuestPreferences_GuestRoomAllocation7_invoker.call(GuestPreferences_6.GuestRoomAllocation)
      }
  
    // @LINE:28
    case controllers_AdminHomeController_adminRedirect8_route(params) =>
      call { 
        controllers_AdminHomeController_adminRedirect8_invoker.call(AdminHomeController_7.adminRedirect)
      }
  
    // @LINE:30
    case controllers_AssignWaiterController_updateRoomWaiter9_route(params) =>
      call { 
        controllers_AssignWaiterController_updateRoomWaiter9_invoker.call(AssignWaiterController_3.updateRoomWaiter)
      }
  
    // @LINE:32
    case controllers_AdminRoomController_addRoomButton10_route(params) =>
      call { 
        controllers_AdminRoomController_addRoomButton10_invoker.call(AdminRoomController_8.addRoomButton)
      }
  
    // @LINE:34
    case controllers_AdminRoomTypeController_addNewRoomType11_route(params) =>
      call { 
        controllers_AdminRoomTypeController_addNewRoomType11_invoker.call(AdminRoomTypeController_4.addNewRoomType)
      }
  
    // @LINE:36
    case controllers_AdminRoomTypeController_createRoom12_route(params) =>
      call { 
        controllers_AdminRoomTypeController_createRoom12_invoker.call(AdminRoomTypeController_4.createRoom)
      }
  
    // @LINE:39
    case controllers_AdminRoomController_createRoom13_route(params) =>
      call { 
        controllers_AdminRoomController_createRoom13_invoker.call(AdminRoomController_8.createRoom)
      }
  
    // @LINE:42
    case controllers_RedirectionController_redirectHome14_route(params) =>
      call { 
        controllers_RedirectionController_redirectHome14_invoker.call(RedirectionController_5.redirectHome)
      }
  
    // @LINE:44
    case controllers_RedirectionController_redirectGuest15_route(params) =>
      call { 
        controllers_RedirectionController_redirectGuest15_invoker.call(RedirectionController_5.redirectGuest)
      }
  
    // @LINE:46
    case controllers_RedirectionController_redirectAdmin16_route(params) =>
      call { 
        controllers_RedirectionController_redirectAdmin16_invoker.call(RedirectionController_5.redirectAdmin)
      }
  
    // @LINE:48
    case controllers_AdminHomeController_checkAdmin17_route(params) =>
      call { 
        controllers_AdminHomeController_checkAdmin17_invoker.call(AdminHomeController_7.checkAdmin)
      }
  
    // @LINE:50
    case controllers_RedirectionController_redirectAdminWaiter18_route(params) =>
      call { 
        controllers_RedirectionController_redirectAdminWaiter18_invoker.call(RedirectionController_5.redirectAdminWaiter)
      }
  
    // @LINE:53
    case controllers_RedirectionController_redirectAdminAddRoom19_route(params) =>
      call { 
        controllers_RedirectionController_redirectAdminAddRoom19_invoker.call(RedirectionController_5.redirectAdminAddRoom)
      }
  
    // @LINE:56
    case controllers_RedirectionController_redirectAdminAddRoomType20_route(params) =>
      call { 
        controllers_RedirectionController_redirectAdminAddRoomType20_invoker.call(RedirectionController_5.redirectAdminAddRoomType)
      }
  
    // @LINE:58
    case controllers_RedirectionController_redirectBookRoom21_route(params) =>
      call { 
        controllers_RedirectionController_redirectBookRoom21_invoker.call(RedirectionController_5.redirectBookRoom)
      }
  
    // @LINE:60
    case controllers_RedirectionController_redirectBookingStatus22_route(params) =>
      call { 
        controllers_RedirectionController_redirectBookingStatus22_invoker.call(RedirectionController_5.redirectBookingStatus)
      }
  }
}
