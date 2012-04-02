package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.IRClassType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRUnionType;
import org.eclipse.dltk.javascript.typeinfo.MemberPredicate;

public class RTypeUtil {

	protected static MemberPredicate memberPredicateFor(final IRType propType) {
		if (propType instanceof IRClassType)
			return MemberPredicate.STATIC;
		else if (propType instanceof IRUnionType)
			return MemberPredicate.ALWAYS_TRUE;
		else {
			return MemberPredicate.NON_STATIC;
		}
	}

}
