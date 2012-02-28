/**
 * 
 */
package nta.engine.exec.eval;

import nta.catalog.Schema;
import nta.catalog.proto.CatalogProtos.DataType;
import nta.datum.Datum;
import nta.storage.Tuple;

/**
 * @author Hyunsik Choi
 */
public class PartialBinaryExpr extends EvalNode {
  
  public PartialBinaryExpr(Type type) {
    super(type);
  }

  public PartialBinaryExpr(Type type, EvalNode left, EvalNode right) {
    super(type, left, right);
  }

  @Override
  public DataType getValueType() {
    return null;
  }

  @Override
  public String getName() {
    return "nonamed";
  }
  
  public String toString() {
    return 
        (leftExpr != null ? leftExpr.toString() : "[EMPTY]") 
        + " " + type + " " 
        + (rightExpr != null ? rightExpr.toString() : "[EMPTY]");
  }

  @Override
  public Datum eval(Schema schema, Tuple tuple, Datum... args) {
    throw new InvalidEvalException(
        "ERROR: cannot evaluate the partial binary expression: " 
            + this.toString() );
  }
}