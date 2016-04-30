object Primes extends App {
def isPrime(n: Int) : Boolean = (2 until n) forall (n % _ != 0)
for (i <- 1 to 100;if isPrime(i)) println(i)
 }