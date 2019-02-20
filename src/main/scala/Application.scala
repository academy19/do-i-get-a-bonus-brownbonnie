object Application {

  val salary = new Salary(List())

  def main(args : Array[String]) : Unit = {
    println(salary.calculateBonus(100, true))  // should print £120
    println(salary.calculateBonus(100, false)) // should print £100
    println(salary.calculateBonus(99, true))   // should print £118
  }

}