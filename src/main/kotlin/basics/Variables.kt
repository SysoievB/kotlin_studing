package basics

class Variables {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var age: Int = 23
            println("var = " + age)
            val age1: Int = 32
            println("val = " + age1)
        }
    }
}
//Key Differences var, val, and const
//Feature	        var	                    val	                  const val
//Mutability	    Mutable (can change)	Immutable (fixed)	  Immutable (fixed)
//Reassignment	    Allowed	                Not allowed	          Not allowed
//Initialization	Runtime	                Runtime	              Compile-time
//Backing Field	    Getter + Setter	        Getter only	          Inlined (no field)
//Scope	            Anywhere	            Anywhere	          Top-level/object
//Types Allowed	    Any	                    Any	                  Primitives/String