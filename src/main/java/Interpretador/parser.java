
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

package Interpretador;

import java_cup.runtime.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\062\000\002\002\004\000\002\002\012\000\002\002" +
    "\010\000\002\002\006\000\002\002\007\000\002\002\005" +
    "\000\002\002\005\000\002\002\011\000\002\002\007\000" +
    "\002\002\005\000\002\002\006\000\002\002\004\000\002" +
    "\002\004\000\002\003\007\000\002\003\007\000\002\003" +
    "\006\000\002\003\006\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\003\003\000\002\004\005\000" +
    "\002\004\005\000\002\004\005\000\002\004\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\006\007\000\002\006\007\000\002\007\006" +
    "\000\002\010\003\000\002\010\005\000\002\010\003\000" +
    "\002\010\005\000\002\011\005\000\002\011\005\000\002" +
    "\011\004\000\002\012\004\000\002\012\004\000\002\012" +
    "\005\000\002\012\005\000\002\012\005\000\002\012\005" +
    "\000\002\013\006\000\002\013\006\000\002\013\006\000" +
    "\002\014\011\000\002\014\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\202\000\012\007\004\013\005\014\006\015\010\001" +
    "\002\000\004\006\173\001\002\000\004\010\170\001\002" +
    "\000\010\004\161\005\157\010\160\001\002\000\004\007" +
    "\155\001\002\000\004\011\144\001\002\000\004\030\143" +
    "\001\002\000\004\030\142\001\002\000\014\002\016\007" +
    "\014\013\005\014\006\015\010\001\002\000\004\006\025" +
    "\001\002\000\004\007\023\001\002\000\004\002\001\001" +
    "\002\000\004\030\022\001\002\000\004\030\021\001\002" +
    "\000\014\002\ufffc\007\ufffc\013\ufffc\014\ufffc\015\ufffc\001" +
    "\002\000\014\002\ufffb\007\ufffb\013\ufffb\014\ufffb\015\ufffb" +
    "\001\002\000\004\030\024\001\002\000\014\002\ufffe\007" +
    "\ufffe\013\ufffe\014\ufffe\015\ufffe\001\002\000\010\006\026" +
    "\021\030\022\031\001\002\000\010\004\060\005\057\007" +
    "\056\001\002\000\004\030\054\001\002\000\006\007\050" +
    "\012\033\001\002\000\006\007\032\012\033\001\002\000" +
    "\006\004\047\005\046\001\002\000\004\026\035\001\002" +
    "\000\010\013\uffd9\014\uffd9\030\uffd9\001\002\000\006\004" +
    "\040\005\036\001\002\000\006\027\uffe1\031\044\001\002" +
    "\000\004\027\043\001\002\000\006\027\uffdf\031\041\001" +
    "\002\000\006\004\040\005\036\001\002\000\004\027\uffde" +
    "\001\002\000\010\013\uffe2\014\uffe2\030\uffe2\001\002\000" +
    "\006\004\040\005\036\001\002\000\004\027\uffe0\001\002" +
    "\000\010\013\uffd6\014\uffd6\030\uffd6\001\002\000\010\013" +
    "\uffd5\014\uffd5\030\uffd5\001\002\000\006\004\053\005\052" +
    "\001\002\000\010\013\uffda\014\uffda\030\uffda\001\002\000" +
    "\010\013\uffd8\014\uffd8\030\uffd8\001\002\000\010\013\uffd7" +
    "\014\uffd7\030\uffd7\001\002\000\014\002\ufffd\007\ufffd\013" +
    "\ufffd\014\ufffd\015\ufffd\001\002\000\004\030\141\001\002" +
    "\000\004\007\071\001\002\000\004\023\065\001\002\000" +
    "\004\023\061\001\002\000\004\007\062\001\002\000\004" +
    "\007\063\001\002\000\004\012\033\001\002\000\004\030" +
    "\uffe4\001\002\000\004\007\066\001\002\000\004\007\067" +
    "\001\002\000\004\012\033\001\002\000\004\030\uffe3\001" +
    "\002\000\010\004\076\005\072\024\075\001\002\000\006" +
    "\017\122\020\123\001\002\000\006\025\uffee\030\uffee\001" +
    "\002\000\004\030\140\001\002\000\006\004\110\005\106" +
    "\001\002\000\006\017\100\020\101\001\002\000\006\025" +
    "\uffed\030\uffed\001\002\000\006\004\105\005\104\001\002" +
    "\000\006\004\103\005\102\001\002\000\006\025\uffe6\030" +
    "\uffe6\001\002\000\006\025\uffe8\030\uffe8\001\002\000\006" +
    "\025\uffea\030\uffea\001\002\000\006\025\uffec\030\uffec\001" +
    "\002\000\006\017\131\020\132\001\002\000\004\025\130" +
    "\001\002\000\006\017\113\020\114\001\002\000\004\025" +
    "\112\001\002\000\006\025\uffef\030\uffef\001\002\000\010" +
    "\004\120\005\116\024\075\001\002\000\010\004\103\005" +
    "\102\025\115\001\002\000\006\025\ufff2\030\ufff2\001\002" +
    "\000\010\017\122\020\123\025\uffea\001\002\000\004\025" +
    "\121\001\002\000\010\017\100\020\101\025\uffec\001\002" +
    "\000\006\025\ufff4\030\ufff4\001\002\000\006\004\127\005" +
    "\126\001\002\000\006\004\125\005\124\001\002\000\006" +
    "\025\uffe5\030\uffe5\001\002\000\006\025\uffe7\030\uffe7\001" +
    "\002\000\006\025\uffe9\030\uffe9\001\002\000\006\025\uffeb" +
    "\030\uffeb\001\002\000\006\025\ufff0\030\ufff0\001\002\000" +
    "\010\004\136\005\134\024\075\001\002\000\010\004\125" +
    "\005\124\025\133\001\002\000\006\025\ufff1\030\ufff1\001" +
    "\002\000\010\017\122\020\123\025\uffe9\001\002\000\004" +
    "\025\137\001\002\000\010\017\100\020\101\025\uffeb\001" +
    "\002\000\006\025\ufff3\030\ufff3\001\002\000\014\002\000" +
    "\007\000\013\000\014\000\015\000\001\002\000\014\002" +
    "\uffff\007\uffff\013\uffff\014\uffff\015\uffff\001\002\000\014" +
    "\002\ufff6\007\ufff6\013\ufff6\014\ufff6\015\ufff6\001\002\000" +
    "\014\002\ufff5\007\ufff5\013\ufff5\014\ufff5\015\ufff5\001\002" +
    "\000\004\006\145\001\002\000\006\021\030\022\031\001" +
    "\002\000\006\013\005\014\006\001\002\000\004\016\153" +
    "\001\002\000\004\016\151\001\002\000\004\013\005\001" +
    "\002\000\004\030\uffd0\001\002\000\004\013\005\001\002" +
    "\000\004\030\uffd1\001\002\000\004\030\156\001\002\000" +
    "\014\002\ufff8\007\ufff8\013\ufff8\014\ufff8\015\ufff8\001\002" +
    "\000\004\007\166\001\002\000\004\007\164\001\002\000" +
    "\004\007\162\001\002\000\004\011\163\001\002\000\006" +
    "\016\uffd3\030\uffd3\001\002\000\004\011\165\001\002\000" +
    "\006\016\uffd2\030\uffd2\001\002\000\004\011\167\001\002" +
    "\000\006\016\uffd4\030\uffd4\001\002\000\014\004\172\005" +
    "\171\007\uffdb\016\uffdb\030\uffdb\001\002\000\010\007\uffdd" +
    "\016\uffdd\030\uffdd\001\002\000\010\007\uffdc\016\uffdc\030" +
    "\uffdc\001\002\000\010\006\174\021\030\022\031\001\002" +
    "\000\010\004\060\005\057\007\200\001\002\000\004\030" +
    "\176\001\002\000\014\002\ufff7\007\ufff7\013\ufff7\014\ufff7" +
    "\015\ufff7\001\002\000\004\030\204\001\002\000\004\007" +
    "\201\001\002\000\010\004\076\005\072\024\075\001\002" +
    "\000\004\030\203\001\002\000\014\002\ufffa\007\ufffa\013" +
    "\ufffa\014\ufffa\015\ufffa\001\002\000\014\002\ufff9\007\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\202\000\012\002\012\011\006\013\011\014\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\010\011\014\013\017\014\016\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\026\001\001\000\004\006\054\001\001\000\002\001\001" +
    "\000\004\007\050\001\001\000\004\007\033\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\010\036\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\010\041\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\010\044\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\007\063\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\007\067\001\001\000" +
    "\002\001\001\000\010\003\073\004\072\005\076\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\004\106\005\110\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\116\004\072" +
    "\005\076\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\010\003\134\004\072\005\076\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\012\145\001\001\000" +
    "\006\011\146\013\147\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\011\151\001\001\000\002\001\001\000" +
    "\004\011\153\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\012\174\001\001\000\004\006\176\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\010\003\201\004\072\005\076\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
  
    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
 return al.next_token(); 
    }


  
    AnalisadorLexico al; 
    parser(AnalisadorLexico al){ this.al = al; }

    java.util.Map<String, Integer> simbolos = new java.util.HashMap<String, Integer>();


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= inicio PALAVRA LETRA LETRA PALAVRA PALAVRA expressao DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= inicio PALAVRA LETRA LETRA ordinal DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // inicio ::= inicio repeticao PALAVRA DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // inicio ::= inicio PALAVRA LETRA relacional DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // inicio ::= inicio atribuicao DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // inicio ::= inicio condicional DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // inicio ::= PALAVRA LETRA LETRA PALAVRA PALAVRA expressao DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // inicio ::= PALAVRA LETRA LETRA ordinal DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // inicio ::= repeticao PALAVRA DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // inicio ::= PALAVRA LETRA relacional DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // inicio ::= atribuicao DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // inicio ::= condicional DELIMITADOR 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expressao ::= SEPARADOR_ABRE_PARENTESE DIGITO OPERADOR_SOMA expressao SEPARADOR_FECHA_PARENTESE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expressao ::= SEPARADOR_ABRE_PARENTESE NUMERO OPERADOR_SOMA expressao SEPARADOR_FECHA_PARENTESE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expressao ::= SEPARADOR_ABRE_PARENTESE DIGITO OPERADOR_SUBTRACAO SEPARADOR_FECHA_PARENTESE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expressao ::= SEPARADOR_ABRE_PARENTESE NUMERO OPERADOR_SUBTRACAO SEPARADOR_FECHA_PARENTESE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // expressao ::= SEPARADOR_ABRE_PARENTESE soma SEPARADOR_FECHA_PARENTESE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // expressao ::= SEPARADOR_ABRE_PARENTESE subtracao SEPARADOR_FECHA_PARENTESE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // expressao ::= soma 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // expressao ::= subtracao 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expressao",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // soma ::= DIGITO OPERADOR_SOMA DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("soma",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // soma ::= NUMERO OPERADOR_SOMA DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("soma",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // soma ::= DIGITO OPERADOR_SOMA NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("soma",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // soma ::= NUMERO OPERADOR_SOMA NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("soma",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // subtracao ::= DIGITO OPERADOR_SUBTRACAO DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("subtracao",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // subtracao ::= NUMERO OPERADOR_SUBTRACAO DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("subtracao",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // subtracao ::= DIGITO OPERADOR_SUBTRACAO NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("subtracao",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // subtracao ::= NUMERO OPERADOR_SUBTRACAO NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("subtracao",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // ordinal ::= DIGITO SIMBOLO_ORDINAL PALAVRA PALAVRA lista 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ordinal",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // ordinal ::= NUMERO SIMBOLO_ORDINAL PALAVRA PALAVRA lista 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("ordinal",4, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // lista ::= LISTA SEPARADOR_ABRE_COLCHETE numerico SEPARADOR_FECHA_COLCHETE 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("lista",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // numerico ::= NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("numerico",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // numerico ::= NUMERO SEPARADOR numerico 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("numerico",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // numerico ::= DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("numerico",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // numerico ::= DIGITO SEPARADOR numerico 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("numerico",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // repeticao ::= REPETICAO STRING NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("repeticao",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // repeticao ::= REPETICAO STRING DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("repeticao",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // repeticao ::= REPETICAO STRING 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("repeticao",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // relacional ::= RELACIONAL_MAIOR lista 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // relacional ::= RELACIONAL_MENOR lista 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // relacional ::= RELACIONAL_MAIOR PALAVRA NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // relacional ::= RELACIONAL_MAIOR PALAVRA DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // relacional ::= RELACIONAL_MENOR PALAVRA NUMERO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // relacional ::= RELACIONAL_MENOR PALAVRA DIGITO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("relacional",8, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // atribuicao ::= ATRIBUICAO NUMERO PALAVRA VARIAVEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atribuicao",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // atribuicao ::= ATRIBUICAO DIGITO PALAVRA VARIAVEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atribuicao",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // atribuicao ::= ATRIBUICAO STRING PALAVRA VARIAVEL 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("atribuicao",9, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // condicional ::= CONDICIONAL_SE VARIAVEL LETRA relacional repeticao CONDICIONAL_SENAO repeticao 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicional",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // condicional ::= CONDICIONAL_SE VARIAVEL LETRA relacional atribuicao CONDICIONAL_SENAO repeticao 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("condicional",10, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-6)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}