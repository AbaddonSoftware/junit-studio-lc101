package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    @Test
    public void bracketedStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[string]"));
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsOutOfOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void multipleBracketsOutOfOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][][][[]["));
    }

    @Test
    public void doubleBackwardsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(("][][")));
    }

    @Test
    public void nestedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyLeftBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void noBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void complexStringWithImproperBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[This[is[the[song]that]nex[evd]??"));
    }

    @Test
    public void complexStringWithProperBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch[Code[s]RoxoR[s]edoC]hcnuaL]"));
    }



}
