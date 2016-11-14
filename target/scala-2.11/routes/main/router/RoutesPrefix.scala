
// @GENERATOR:play-routes-compiler
// @SOURCE:V:/HotelManagementApplication/conf/routes
// @DATE:Wed Aug 03 00:01:48 EDT 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
