

class Account(id:String,n: Int, b: Double) {

val nic:String=id;
val acnumber: Int = n;
var balance: Double = b;

def transfer(a:Account,b:Double)={this.balance = this.balance + b; a.balance = a.balance -b;}

def neg()={if(this.balance<0) println("["+this.nic +":"+this.acnumber +":"+this.balance +"]")};

def sum()={this.balance}

def interest()=new Account(this.nic,this.acnumber,if(this.balance>0) this.balance*0.05 + this.balance else this.balance*0.1+this.balance);

override def toString = "["+nic+":"+acnumber +":"+ balance+"]";

}

object Q3 extends App{

//def main(args:Array[String]){

var c1 = new Account("001", 1000 , 10000);
var c2 = new Account("002", 1500 , 15000);
var c3 = new Account("003", 1200 , -10);
var c4 = new Account("004", 1300 , -100);

c4.transfer(c2,3000);
println("\ntransfer Succesfull \n customer.2 to customer.4 transfer 3000/=");

var bank:List[Account]=List(c1, c2, c3, c4);

println("\n1. List of Account with negative balance: ");
for(man <- bank){
man.neg();
}

var summs:Double = 0;
for(man <- bank){
summs = summs + man.sum().asInstanceOf[Double];
}

println("\n2.  Calculate the sum of the full account balance: "+summs);

println("\n Calculate the final balance of full accounts after apply the interest: ");
for(man <- bank){
println(man.interest());
}

}
