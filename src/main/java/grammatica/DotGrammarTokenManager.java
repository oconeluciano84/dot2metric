/* Generated By:JavaCC: Do not edit this line. DotGrammarTokenManager.java */
package grammatica;
//import utility.*;

/** Token Manager. */
public class DotGrammarTokenManager implements DotGrammarConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x101000000L) != 0L)
         {
            jjmatchedKind = 45;
            return 43;
         }
         if ((active0 & 0x8000L) != 0L)
            return 55;
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 45;
            return 9;
         }
         if ((active0 & 0x40L) != 0L)
            return 56;
         if ((active0 & 0x10000L) != 0L)
            return 57;
         if ((active0 & 0x17efe000000L) != 0L)
         {
            jjmatchedKind = 45;
            return 34;
         }
         return -1;
      case 1:
         if ((active0 & 0x17ffe000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
            return 34;
         }
         if ((active0 & 0x8000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
            return 10;
         }
         if ((active0 & 0x1000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 1;
            return 51;
         }
         return -1;
      case 2:
         if ((active0 & 0x8040000000L) != 0L)
            return 34;
         if ((active0 & 0x17fbf000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 2;
            return 34;
         }
         return -1;
      case 3:
         if ((active0 & 0x17fbf000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 3;
            return 34;
         }
         return -1;
      case 4:
         if ((active0 & 0x19a3000000L) != 0L)
            return 34;
         if ((active0 & 0x1661c000000L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 45;
               jjmatchedPos = 4;
            }
            return 34;
         }
         return -1;
      case 5:
         if ((active0 & 0x10000000L) != 0L)
            return 34;
         if ((active0 & 0x17e0c000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 5;
            return 34;
         }
         return -1;
      case 6:
         if ((active0 & 0x12000000000L) != 0L)
            return 34;
         if ((active0 & 0x5e0c000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 6;
            return 34;
         }
         return -1;
      case 7:
         if ((active0 & 0x4204000000L) != 0L)
            return 34;
         if ((active0 & 0x1c08000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 7;
            return 34;
         }
         return -1;
      case 8:
         if ((active0 & 0x408000000L) != 0L)
            return 34;
         if ((active0 & 0x1800000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 8;
            return 34;
         }
         return -1;
      case 9:
         if ((active0 & 0x1800000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 9;
            return 34;
         }
         return -1;
      case 10:
         if ((active0 & 0x1800000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 10;
            return 34;
         }
         return -1;
      case 11:
         if ((active0 & 0x1800000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 11;
            return 34;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 34:
         return jjStartNfaWithStates_0(0, 16, 57);
      case 44:
         return jjStopAtPos(0, 8);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 58:
         return jjStopAtPos(0, 5);
      case 59:
         return jjStopAtPos(0, 10);
      case 60:
         return jjStopAtPos(0, 9);
      case 61:
         return jjStopAtPos(0, 7);
      case 62:
         return jjStartNfaWithStates_0(0, 6, 56);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x40000000L);
      case 91:
         return jjStopAtPos(0, 11);
      case 93:
         return jjStopAtPos(0, 12);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x8000000000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x60c000000L);
      case 104:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1880000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x101000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x10000000000L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 123:
         return jjStopAtPos(0, 13);
      case 125:
         return jjStopAtPos(0, 14);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         break;
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1880000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x4010000000L);
      case 103:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x8028000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x10606000000L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 76:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 34);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x1880000000L);
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 100:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0xa000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x4604000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000000L);
      case 114:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 39, 34);
         break;
      case 121:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000000000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x1880000000L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x10009000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x2002000000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x624000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x408000000L);
      case 101:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 34);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(4, 32, 34);
         break;
      case 104:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(4, 29, 34);
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 108:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x3800000000L);
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 114:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 34);
         break;
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 102:
         return jjMoveStringLiteralDfa6_0(active0, 0x1800000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x10004000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x2408000000L);
      case 116:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 28, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
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
      case 108:
         return jjMoveStringLiteralDfa7_0(active0, 0x408000000L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x200000000L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x5800000000L);
      case 112:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 40, 34);
         break;
      case 114:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 37, 34);
         break;
      case 122:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
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
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(7, 26, 34);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(7, 33, 34);
         break;
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x1800000000L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x408000000L);
      case 114:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 38, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
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
      case 114:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(8, 27, 34);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(8, 34, 34);
         break;
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x1800000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private int jjMoveStringLiteralDfa9_0(long old0, long active0)
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
      case 110:
         return jjMoveStringLiteralDfa10_0(active0, 0x1000000000L);
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private int jjMoveStringLiteralDfa10_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa11_0(active0, 0x1000000000L);
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
private int jjMoveStringLiteralDfa11_0(long old0, long active0)
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
      case 109:
         return jjMoveStringLiteralDfa12_0(active0, 0x1000000000L);
      case 122:
         return jjMoveStringLiteralDfa12_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
private int jjMoveStringLiteralDfa12_0(long old0, long active0)
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
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(12, 35, 34);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(12, 36, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 55;
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
               case 56:
                  if ((0xfffffffeffffd9ffL & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  if (curChar == 60)
                  {
                     if (kind > 45)
                        kind = 45;
                  }
                  break;
               case 9:
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(34);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(34);
                  break;
               case 10:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(34);
                  break;
               case 57:
                  if ((0xfffffffaffffd9ffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 34)
                  {
                     if (kind > 45)
                        kind = 45;
                  }
                  break;
               case 51:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(34);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  else if (curChar == 62)
                     jjCheckNAddTwoStates(40, 41);
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 46)
                     jjCheckNAdd(29);
                  else if (curChar == 45)
                     jjCheckNAddTwoStates(28, 30);
                  break;
               case 55:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  else if (curChar == 46)
                     jjCheckNAdd(29);
                  break;
               case 27:
                  if (curChar == 45)
                     jjCheckNAddTwoStates(28, 30);
                  break;
               case 28:
                  if (curChar == 46)
                     jjCheckNAdd(29);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(29);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 31:
                  if (curChar != 46)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(32);
                  break;
               case 32:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(32);
                  break;
               case 35:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 36:
                  if ((0xfffffffaffffd9ffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 38:
                  if (curChar == 34 && kind > 45)
                     kind = 45;
                  break;
               case 39:
                  if (curChar == 62)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 40:
                  if ((0xfffffffeffffd9ffL & l) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 41:
                  if (curChar == 60 && kind > 45)
                     kind = 45;
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
               case 56:
               case 40:
                  jjCheckNAddTwoStates(40, 41);
                  break;
               case 9:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(34);
                  }
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 43:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(34);
                  }
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 51;
                  else if ((0x20000000200000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 44;
                  break;
               case 10:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(34);
                  }
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 57:
                  jjCheckNAddStates(0, 2);
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 51:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(34);
                  }
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 52;
                  break;
               case 0:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 45)
                        kind = 45;
                     jjCheckNAdd(34);
                  }
                  if ((0x8000000080000L & l) != 0L)
                     jjAddStates(3, 4);
                  else if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  else if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  else if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 1:
                  if ((0x800000008000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 2:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x2000000020L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 4:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x2000000020L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 8:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 12:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x10000000100L & l) != 0L && kind > 19)
                     kind = 19;
                  break;
               case 15:
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 16:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x10000000100L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 20:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 21:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 22:
                  if ((0x400000004000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 23:
                  if ((0x80000000800L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 24:
                  if ((0x1000000010L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 25:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 26:
                  if ((0x4000000040000L & l) != 0L && kind > 23)
                     kind = 23;
                  break;
               case 33:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(34);
                  break;
               case 34:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  jjCheckNAdd(34);
                  break;
               case 36:
                  jjCheckNAddStates(0, 2);
                  break;
               case 37:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 35;
                  break;
               case 42:
                  if ((0x8000000080000L & l) != 0L)
                     jjAddStates(3, 4);
                  break;
               case 44:
                  if ((0x400000004L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 45;
                  break;
               case 45:
                  if ((0x8000000080L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 46:
                  if ((0x4000000040000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 47;
                  break;
               case 47:
                  if ((0x200000002L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 48;
                  break;
               case 48:
                  if ((0x1000000010000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 49;
                  break;
               case 49:
                  if ((0x10000000100L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 50:
                  if ((0x10000000100000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 52:
                  if ((0x20000000200L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 53:
                  if ((0x800000008L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 54;
                  break;
               case 54:
                  if ((0x10000000100000L & l) != 0L && kind > 22)
                     kind = 22;
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
               case 56:
               case 40:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(40, 41);
                  break;
               case 57:
               case 36:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 55 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   36, 37, 38, 43, 50, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\72", "\76", "\75", "\54", "\74", "\73", "\133", 
"\135", "\173", "\175", "\55\76", "\42", null, null, null, null, null, null, null, 
"\163\164\171\154\145", "\143\157\154\157\162", "\146\157\156\164\163\151\172\145", 
"\146\151\154\154\143\157\154\157\162", "\150\145\151\147\150\164", "\167\151\144\164\150", "\125\122\114", 
"\154\141\142\145\154", "\163\150\141\160\145", "\146\157\156\164\156\141\155\145", 
"\146\157\156\164\143\157\154\157\162", "\154\141\142\145\154\146\157\156\164\163\151\172\145", 
"\154\141\142\145\154\146\157\156\164\156\141\155\145", "\142\147\143\157\154\157\162", "\160\145\156\143\157\154\157\162", 
"\144\151\162", "\164\157\157\154\164\151\160", null, null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x21ffffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[55];
private final int[] jjstateSet = new int[110];
protected char curChar;
/** Constructor. */
public DotGrammarTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public DotGrammarTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 55; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
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

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
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
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
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

private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
