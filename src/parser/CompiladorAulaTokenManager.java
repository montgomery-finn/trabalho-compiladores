/* Generated By:JJTree&JavaCC: Do not edit this line. CompiladorAulaTokenManager.java */
package parser;
import recovery.*;

/** Token Manager. */
public class CompiladorAulaTokenManager implements CompiladorAulaConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7fc00060L) != 0L)
         {
            jjmatchedKind = 31;
            return 4;
         }
         return -1;
      case 1:
         if ((active0 & 0x8000000L) != 0L)
            return 4;
         if ((active0 & 0x77c00060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 1;
            return 4;
         }
         return -1;
      case 2:
         if ((active0 & 0x77c00060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
            return 4;
         }
         return -1;
      case 3:
         if ((active0 & 0x20000000L) != 0L)
            return 4;
         if ((active0 & 0x57c00060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 3;
            return 4;
         }
         return -1;
      case 4:
         if ((active0 & 0x2000000L) != 0L)
            return 4;
         if ((active0 & 0x55c00060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
            return 4;
         }
         return -1;
      case 5:
         if ((active0 & 0x55c00060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 5;
            return 4;
         }
         return -1;
      case 6:
         if ((active0 & 0x40400000L) != 0L)
            return 4;
         if ((active0 & 0x15800060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 6;
            return 4;
         }
         return -1;
      case 7:
         if ((active0 & 0x11800000L) != 0L)
            return 4;
         if ((active0 & 0x4000060L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 7;
            return 4;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000040L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 8;
            return 4;
         }
         if ((active0 & 0x20L) != 0L)
            return 4;
         return -1;
      case 9:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 9;
            return 4;
         }
         if ((active0 & 0x4000000L) != 0L)
            return 4;
         return -1;
      case 10:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 10;
            return 4;
         }
         return -1;
      case 11:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 11;
            return 4;
         }
         return -1;
      case 12:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 12;
            return 4;
         }
         return -1;
      case 13:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 13;
            return 4;
         }
         return -1;
      case 14:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 14;
            return 4;
         }
         return -1;
      case 15:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 15;
            return 4;
         }
         return -1;
      case 16:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 16;
            return 4;
         }
         return -1;
      case 17:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 17;
            return 4;
         }
         return -1;
      case 18:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 18;
            return 4;
         }
         return -1;
      case 19:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 19;
            return 4;
         }
         return -1;
      case 20:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 20;
            return 4;
         }
         return -1;
      case 21:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 21;
            return 4;
         }
         return -1;
      case 22:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 22;
            return 4;
         }
         return -1;
      case 23:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 23;
            return 4;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         jjmatchedKind = 1;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 33:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 40:
         return jjStopAtPos(0, 18);
      case 41:
         return jjStopAtPos(0, 19);
      case 44:
         return jjStopAtPos(0, 8);
      case 59:
         return jjStopAtPos(0, 7);
      case 60:
         return jjMoveStringLiteralDfa1_0(0x10800L);
      case 61:
         jjmatchedKind = 17;
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 62:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x50000060L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 123:
         return jjStopAtPos(0, 20);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 125:
         return jjStopAtPos(0, 21);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 38:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         break;
      case 61:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(1, 9);
         else if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(1, 10);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(1, 12);
         break;
      case 62:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 86:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x3000000L);
      case 101:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(1, 27, 4);
         return jjMoveStringLiteralDfa2_0(active0, 0x24000000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x10400000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 124:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000040L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 113:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x5000000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x20L);
      case 97:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 4);
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x14000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 101:
         return jjMoveStringLiteralDfa5_0(active0, 0x40800040L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 109:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800020L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x10000000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x400040L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 118:
         return jjMoveStringLiteralDfa6_0(active0, 0x40000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 86:
         return jjMoveStringLiteralDfa7_0(active0, 0x20L);
      case 97:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(6, 30, 4);
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x5000000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      case 111:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 4);
         break;
      case 116:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa8_0(active0, 0x20L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000L);
      case 109:
         return jjMoveStringLiteralDfa8_0(active0, 0x40L);
      case 111:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(7, 23, 4);
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(7, 28, 4);
         break;
      case 114:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 24, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa9_0(active0, 0x40L);
      case 114:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000L);
      case 122:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(8, 5, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa10_0(active0, 0x40L);
      case 111:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(9, 26, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 108:
         return jjMoveStringLiteralDfa11_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0);
      return 12;
   }
   switch(curChar)
   {
      case 122:
         return jjMoveStringLiteralDfa13_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0);
      return 13;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa14_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(12, active0);
}
static private int jjMoveStringLiteralDfa14_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(12, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(13, active0);
      return 14;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa15_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(13, active0);
}
static private int jjMoveStringLiteralDfa15_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(13, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(14, active0);
      return 15;
   }
   switch(curChar)
   {
      case 80:
         return jjMoveStringLiteralDfa16_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(14, active0);
}
static private int jjMoveStringLiteralDfa16_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(14, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(15, active0);
      return 16;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa17_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(15, active0);
}
static private int jjMoveStringLiteralDfa17_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(15, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(16, active0);
      return 17;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa18_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(16, active0);
}
static private int jjMoveStringLiteralDfa18_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(16, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(17, active0);
      return 18;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa19_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(17, active0);
}
static private int jjMoveStringLiteralDfa19_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(17, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(18, active0);
      return 19;
   }
   switch(curChar)
   {
      case 83:
         return jjMoveStringLiteralDfa20_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(18, active0);
}
static private int jjMoveStringLiteralDfa20_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(18, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(19, active0);
      return 20;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa21_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(19, active0);
}
static private int jjMoveStringLiteralDfa21_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(19, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(20, active0);
      return 21;
   }
   switch(curChar)
   {
      case 109:
         return jjMoveStringLiteralDfa22_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(20, active0);
}
static private int jjMoveStringLiteralDfa22_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(20, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(21, active0);
      return 22;
   }
   switch(curChar)
   {
      case 112:
         return jjMoveStringLiteralDfa23_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(21, active0);
}
static private int jjMoveStringLiteralDfa23_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(21, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(22, active0);
      return 23;
   }
   switch(curChar)
   {
      case 114:
         return jjMoveStringLiteralDfa24_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(22, active0);
}
static private int jjMoveStringLiteralDfa24_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(22, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(23, active0);
      return 24;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(24, 6, 4);
         break;
      default :
         break;
   }
   return jjStartNfa_0(23, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(5);
                  }
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if (curChar == 39 && kind > 35)
                     kind = 35;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 4:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(4);
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\145\162\141\125\155\141\126\145\172", 
"\145\126\151\166\145\162\141\155\106\145\154\151\172\145\163\120\141\162\141\123\145\155\160\162\145", "\73", "\54", "\75\75", "\76\75", "\74\75", "\41\75", "\46\46", "\174\174", 
"\40\76", "\74\40", "\75", "\50", "\51", "\173", "\175", "\151\156\164\145\151\162\157", 
"\142\157\157\154\145\141\156\157", "\143\141\162\141\143\164\145\162", "\146\141\154\163\157", 
"\166\145\162\144\141\144\145\151\162\157", "\163\145", "\145\156\161\165\141\156\164\157", "\154\145\151\141", 
"\145\163\143\162\145\166\141", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xfffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[6];
static private final int[] jjstateSet = new int[12];
static protected char curChar;
/** Constructor. */
public CompiladorAulaTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CompiladorAulaTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}
