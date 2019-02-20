class Salary (salaryList: List[Int]) {

  def calculateBonus(salary: Int, ifBonus: Boolean) = {
    ifBonus match {
      case false => s"Your salary is £$salary"
      case true => s"Your salary is £${(salary * 1.2).toInt}"
    }
  }

  def salaryHistory = ???

}
