package controllers.v2

import javax.inject._
import play.api.mvc._

/**
  * This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class Controller @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok("You've reached the index")
  }

  def dummy(id: String) = Action { implicit request: Request[AnyContent] =>
    Ok("You've reached the v2 dummy end-point with id: " + id)
  }
}
