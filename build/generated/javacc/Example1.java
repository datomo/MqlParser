/* Example1.java */
/* Generated By:JavaCC: Do not edit this line. Example1.java */
/**
 * Simple brace matcher.
 */
public class Example1 implements Example1Constants {
  /** Main entry point. */
  public static void main(String args[]) throws ParseException {
    Example1 parser = new Example1(System.in);
    parser.Input();
  }

/** Root production. */
  static final public void Input() throws ParseException {MqlNode n;
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case 8:{
        ;
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      n = Statement();
      jj_consume_token(EOL);
    }
    jj_consume_token(0);
  }

/** Brace matching production. */
  static final public MqlNode Statement() throws ParseException {MqlNode n;
    jj_consume_token(8);
    n = DbStatement();
{if ("" != null) return n;}
    throw new Error("Missing return statement in function");
  }

  static final public String Name() throws ParseException {Token t;
    t = jj_consume_token(IDENTIFIER);
{if ("" != null) return t.image;}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode DbStatement() throws ParseException {MqlNode n;
    String name;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 9:{
      jj_consume_token(9);
      name = Name();
      jj_consume_token(10);
n = new MqlCreateCollection(name);
      break;
      }
    case 11:{
      jj_consume_token(11);
      name = Name();
      jj_consume_token(10);
n = new MqlSelectCollection(name);
      break;
      }
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    case 20:
    case 21:
    case 22:
    case 23:
    case 24:{
      n = CollectionStatement(null);
      break;
      }
    case IDENTIFIER:{
      name = Name();
      jj_consume_token(12);
      n = CollectionStatement(name);
      break;
      }
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return n;}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode CollectionStatement(String collection) throws ParseException {MqlNode n;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 21:{
      n = FindStatement(collection);
      break;
      }
    case 22:
    case 23:
    case 24:{
      n = InsertStatement(collection);
      break;
      }
    case 19:
    case 20:{
      n = CountStatement(collection);
      break;
      }
    case 18:{
      n = AggregateStatement(collection);
      break;
      }
    case 16:
    case 17:{
      n = UpdateStatement(collection);
      break;
      }
    case 15:{
      n = ReplaceStatement(collection);
      break;
      }
    case 14:{
      n = SaveStatement(collection);
      break;
      }
    case 13:{
      n = RemoveStatement(collection);
      break;
      }
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return n;}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode RemoveStatement(String collection) throws ParseException {BsonDocument doc;
    jj_consume_token(13);
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlRemove(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode SaveStatement(String collection) throws ParseException {BsonDocument doc;
    jj_consume_token(14);
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlSave(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode ReplaceStatement(String collection) throws ParseException {BsonDocument doc;
    jj_consume_token(15);
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlReplace(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode UpdateStatement(String collection) throws ParseException {BsonDocument doc;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 16:{
      jj_consume_token(16);
      break;
      }
    case 17:{
      jj_consume_token(17);
      break;
      }
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlUpdate(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode AggregateStatement(String collection) throws ParseException {BsonDocument doc;
    jj_consume_token(18);
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlAggregate(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode CountStatement(String collection) throws ParseException {BsonDocument doc;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 19:{
      jj_consume_token(19);
      doc = Document();
      jj_consume_token(10);
{if ("" != null) return new MqlCount(collection, doc, true);}
      break;
      }
    case 20:{
      jj_consume_token(20);
      doc = Document();
      jj_consume_token(10);
{if ("" != null) return new MqlCount(collection, doc);}
      break;
      }
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode FindStatement(String collection) throws ParseException {BsonDocument doc;
    jj_consume_token(21);
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlCollectionStatement(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public MqlNode InsertStatement(String collection) throws ParseException {BsonDocument doc;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 22:{
      jj_consume_token(22);
      break;
      }
    case 23:{
      jj_consume_token(23);
      break;
      }
    case 24:{
      jj_consume_token(24);
      break;
      }
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    doc = Document();
    jj_consume_token(10);
{if ("" != null) return new MqlInsert(collection, doc);}
    throw new Error("Missing return statement in function");
  }

  static final public BsonDocument Document() throws ParseException {String key;
    String value;
    jj_consume_token(25);
    key = Literal();
    jj_consume_token(26);
    value = Literal();
    jj_consume_token(27);
{if ("" != null) return new BsonDocument( key, value);}
    throw new Error("Missing return statement in function");
  }

  static final public String Literal() throws ParseException {Token t;
    switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
    case 28:{
      jj_consume_token(28);
      t = jj_consume_token(IDENTIFIER);
      jj_consume_token(28);
      break;
      }
    case IDENTIFIER:{
      t = jj_consume_token(IDENTIFIER);
      break;
      }
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
{if ("" != null) return t.image;}
    throw new Error("Missing return statement in function");
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public Example1TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[7];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x100,0x1ffea10,0x1ffe000,0x30000,0x180000,0x1c00000,0x10000010,};
   }

  /** Constructor with InputStream. */
  public Example1(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Example1(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new Example1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Example1(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new Example1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
	if (jj_input_stream == null) {
      jj_input_stream = new SimpleCharStream(stream, 1, 1);
   } else {
      jj_input_stream.ReInit(stream, 1, 1);
   }
   if (token_source == null) {
      token_source = new Example1TokenManager(jj_input_stream);
   }

    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Example1(Example1TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(Example1TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 7; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[29];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 7; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 29; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
