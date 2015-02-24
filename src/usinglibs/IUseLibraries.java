package usinglibs;

import hithere.Hi;
import silly.SillyLib;
import hello.Hey;

public class IUseLibraries {

	SillyLib sillyLib;
	Hi hi;
	Hey hey;
	
	public IUseLibraries() {
		hi = new Hi();
		hi.sayHi();
		hey.sayHey();
	}
}
