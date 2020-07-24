package com.company.Dubstep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DubstepTest {
    @Test
    public void Test1() {
        assertEquals("ABC", new Dubstep().SongDecoder("WUBWUBABCWUB"));
    }

    @Test
    public void Test2() {
        assertEquals("R L", new Dubstep().SongDecoder("RWUBWUBWUBLWUB"));
    }

    @Test
    public void Test3() {
        assertEquals("I AM X", new Dubstep().SongDecoder("WUBWUBIWUBAMWUBWUBX"));
    }

    @Test
    public void Test4() {
        assertEquals("WE ARE THE CHAMPIONS MY FRIEND", new Dubstep().SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB"));
    }

}