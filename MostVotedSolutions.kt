fun digitize(n:Long):IntArray {
    return n.toString().map(Character::getNumericValue).toIntArray().reversedArray()
}



fun digitize2(n:Long):IntArray {
  
  var result = n.toString().map { it.toString().toInt() }.toIntArray();

    return result.reversedArray();
  }
