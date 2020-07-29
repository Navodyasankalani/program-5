class Rational(x: Int, y: Int) {
def numer = x
def denom = y

def neg = new Rational(-this.numer,this.denom);
override def toString = numer+"/"+denom;

//def add(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, denom * r.denom);



}

object Q1{
def main(args:Array[String]){

val x = new Rational(1, 2);
//val y = new Rational(5, 7);

//println(x.add(y));
println(x);
println(y);

println(x.neg);
}

}