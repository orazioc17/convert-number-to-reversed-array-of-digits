// I had to use .toString before reversed because it was returning a char, and it made conversion to ascii
  fun digitize(n:Long):IntArray = IntArray(n.toString().length) { n.toString().reversed()[it].toString().toInt() }
