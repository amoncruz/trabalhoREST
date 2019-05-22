package com.tweet.tweet;

import com.tweet.tweet.Tweet;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TweetController {
    Tweet tweet;
    static List<Tweet> listaTweets = new ArrayList<Tweet>();

    static {
        listaTweets.add(new Tweet(1, "daklwdka", "adawda", "adaaa", "adaa", "adaad", "aaa"));
        listaTweets.add(new Tweet(2, "daklwdka", "adawda", "adaaa", "adaa", "adaad", "aaa"));
    }

    @RequestMapping(value = "/tweets", method = RequestMethod.GET)
    public List<Tweet> listaTweets() {
        return listaTweets;
    }

    @RequestMapping(value = "/tweets/{id}", method = RequestMethod.DELETE)
    public List<Tweet> Delete(@PathVariable("id") int id, Model model) {
        listaTweets.remove(id);
        return listaTweets;
    }

    @RequestMapping(value = "/tweets", method = RequestMethod.POST)
    public List<Tweet> Post(@RequestBody Tweet t) {
        listaTweets.add(t);
        return listaTweets;
    }

    @RequestMapping(value = "/tweets/{id}", method = RequestMethod.PUT)
    public List<Tweet> Put(@RequestBody Tweet t, @PathVariable int id) {
        listaTweets.set(id, t);
        return listaTweets;
    }
}