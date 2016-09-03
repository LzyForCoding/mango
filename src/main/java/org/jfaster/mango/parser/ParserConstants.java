/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
package org.jfaster.mango.parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface ParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int COLON = 1;
  /** RegularExpression Id. */
  int NUMBER = 2;
  /** RegularExpression Id. */
  int DOT = 3;
  /** RegularExpression Id. */
  int FIELD = 4;
  /** RegularExpression Id. */
  int JDBC_TYPE = 5;
  /** RegularExpression Id. */
  int WHITESPACE = 6;
  /** RegularExpression Id. */
  int BLANK = 7;
  /** RegularExpression Id. */
  int QUOTE_TEXT = 8;
  /** RegularExpression Id. */
  int JDBC_ITERABLE_PARAMETER = 9;
  /** RegularExpression Id. */
  int JDBC_PARAMETER = 10;
  /** RegularExpression Id. */
  int GLOBAL_TABLE = 11;
  /** RegularExpression Id. */
  int JOIN_PARAMETER = 12;
  /** RegularExpression Id. */
  int IF_DIRECTIVE = 13;
  /** RegularExpression Id. */
  int ELSEIF_DIRECTIVE = 14;
  /** RegularExpression Id. */
  int ELSE_DIRECTIVE = 15;
  /** RegularExpression Id. */
  int END = 16;
  /** RegularExpression Id. */
  int INSERT = 17;
  /** RegularExpression Id. */
  int DELETE = 18;
  /** RegularExpression Id. */
  int UPDATE = 19;
  /** RegularExpression Id. */
  int SELECT = 20;
  /** RegularExpression Id. */
  int REPLACE = 21;
  /** RegularExpression Id. */
  int MERGE = 22;
  /** RegularExpression Id. */
  int TEXT = 23;
  /** RegularExpression Id. */
  int LOGICAL_AND = 25;
  /** RegularExpression Id. */
  int LOGICAL_OR = 26;
  /** RegularExpression Id. */
  int LOGICAL_LT = 27;
  /** RegularExpression Id. */
  int LOGICAL_LE = 28;
  /** RegularExpression Id. */
  int LOGICAL_GT = 29;
  /** RegularExpression Id. */
  int LOGICAL_GE = 30;
  /** RegularExpression Id. */
  int LOGICAL_EQ = 31;
  /** RegularExpression Id. */
  int LOGICAL_NE = 32;
  /** RegularExpression Id. */
  int LOGICAL_NOT = 33;
  /** RegularExpression Id. */
  int INTEGER_LITERAL = 34;
  /** RegularExpression Id. */
  int STRING_LITERAL = 35;
  /** RegularExpression Id. */
  int TRUE = 36;
  /** RegularExpression Id. */
  int FALSE = 37;
  /** RegularExpression Id. */
  int NULL = 38;
  /** RegularExpression Id. */
  int LPAREN = 39;
  /** RegularExpression Id. */
  int RPAREN = 40;
  /** RegularExpression Id. */
  int PARAMETER = 41;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int EXPRESSION = 1;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\":\"",
    "<NUMBER>",
    "\".\"",
    "<FIELD>",
    "<JDBC_TYPE>",
    "<WHITESPACE>",
    "<BLANK>",
    "<QUOTE_TEXT>",
    "<JDBC_ITERABLE_PARAMETER>",
    "<JDBC_PARAMETER>",
    "\"#table\"",
    "<JOIN_PARAMETER>",
    "\"#if\"",
    "\"#elseif\"",
    "\"#else\"",
    "\"#end\"",
    "\"insert\"",
    "\"delete\"",
    "\"update\"",
    "\"select\"",
    "\"replace\"",
    "\"merge\"",
    "<TEXT>",
    "\" \"",
    "<LOGICAL_AND>",
    "<LOGICAL_OR>",
    "<LOGICAL_LT>",
    "<LOGICAL_LE>",
    "<LOGICAL_GT>",
    "<LOGICAL_GE>",
    "<LOGICAL_EQ>",
    "<LOGICAL_NE>",
    "<LOGICAL_NOT>",
    "<INTEGER_LITERAL>",
    "<STRING_LITERAL>",
    "\"true\"",
    "\"false\"",
    "\"null\"",
    "\"(\"",
    "\")\"",
    "<PARAMETER>",
  };

}
