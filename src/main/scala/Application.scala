object Application {

  def calculateBonus(salary: Int, ifBonus: Boolean) = {
    ifBonus match {
      case false => s"Your salary is £$salary"
      case true => s"Your salary is £${(salary * 1.2).toInt}"
    }
  }

  def main(args : Array[String]) : Unit = {
    println(calculateBonus(100, true))  // should print £120
    println(calculateBonus(100, false)) // should print £100
    println(calculateBonus(99, true))   // should print £118
  }

}