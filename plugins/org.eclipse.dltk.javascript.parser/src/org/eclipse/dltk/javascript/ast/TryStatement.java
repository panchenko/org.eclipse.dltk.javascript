/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class TryStatement extends Statement {

    private Keyword tryKeyword;
    private StatementBlock body;
    private List<CatchClause> catchClauses = new ArrayList<CatchClause>();
    private FinallyClause finallyClause;

    public TryStatement(ASTNode parent) {
        super(parent);
    }

    /**
     * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
     */
    @Override
    public void traverse(ASTVisitor visitor) throws Exception {
        if (visitor.visit(this)) {
            if (tryKeyword != null)
                tryKeyword.traverse(visitor);
            if (body != null)
                body.traverse(visitor);

            if (catchClauses != null) {
                for (CatchClause ctch : catchClauses) {
                    ctch.traverse(visitor);
                }
            }
            if (finallyClause != null)
                finallyClause.traverse(visitor);
            visitor.endvisit(this);
        }
    }

    public Statement getBody() {
        return this.body;
    }

    public void setBody(StatementBlock body) {
        this.body = body;
    }

    public FinallyClause getFinally() {
        return this.finallyClause;
    }

    public void setFinally(FinallyClause finallyClause) {
        this.finallyClause = finallyClause;
    }

    public List<CatchClause> getCatches() {
        return this.catchClauses;
    }

    public Keyword getTryKeyword() {
        return this.tryKeyword;
    }

    public void setTryKeyword(Keyword keyword) {
        this.tryKeyword = keyword;
    }

    @Override
    public String toSourceString(String indentationString) {

        Assert.isTrue(sourceStart() >= 0);
        Assert.isTrue(sourceEnd() > 0);

        StringBuffer buffer = new StringBuffer();

        buffer.append(indentationString);
        buffer.append(Keywords.TRY);
        buffer.append(JSLiterals.EOL);
        buffer.append(body.toSourceString(indentationString));

        for (int i = 0; i < getCatches().size(); i++) {
            buffer.append(getCatches().get(i).toSourceString(indentationString));
        }

        if (getFinally() != null) {
            buffer.append(getFinally().toSourceString(indentationString));
        }

        return buffer.toString();
    }
}
