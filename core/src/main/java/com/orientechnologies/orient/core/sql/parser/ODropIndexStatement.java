/* Generated By:JJTree: Do not edit this line. ODropIndexStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import java.util.Map;

public
class ODropIndexStatement extends OStatement {

  protected boolean all = false;
  protected OIndexName name;

  public ODropIndexStatement(int id) {
    super(id);
  }

  public ODropIndexStatement(OrientSql p, int id) {
    super(p, id);
  }

  @Override public void toString(Map<Object, Object> params, StringBuilder builder) {
    builder.append("DROP INDEX ");
    if (all) {
      builder.append("*");
    } else {
      name.toString(params, builder);
    }
  }
}
/* JavaCC - OriginalChecksum=51c8221d049e4f114378e4be03797050 (do not edit this line) */
