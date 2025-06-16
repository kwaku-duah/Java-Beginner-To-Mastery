package com.springrest.helloworld.controller;

import java.util.LinkedList;
import java.util.List;

import com.springrest.helloworld.Model.Children;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

/*
 * this controller models the children class, newborn babies
 * at a hospital have their names taken and put in a linkedlist
 */

@RestController
public class MaternityWardController {
    

    @GetMapping("/all-children")
    public List<Children> getChildrenDetails() {
        List<Children> children = new LinkedList<>();

        children.add(new Children("Kwaku Duah", 25, 166.45 ));
        children.add(new Children("Gennaro Gattuso", 29, 196.45 ));
        children.add(new Children("Ribery Frank", 75, 156.45 ));
        children.add(new Children("Degraft Osei Owusu", 21, 146.45 ));
        children.add(new Children("Osei Burak", 76, 30.45 ));
        children.add(new Children("Christ Somiah", 30, 162.95 ));
        children.add(new Children("Kenneth Benjamin", 45, 116.45 ));

        return children;
    }
}
