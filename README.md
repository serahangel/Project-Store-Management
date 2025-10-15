# Unit 2 - Store Management Project

## Introduction

You are opening a new business in your community! Businesses often need programs to manage the products and services they offer and track orders and requests from customers. Your goal is to create a store management system for your business.

## Requirements

Use your knowledge of object-oriented programming and class structure and design to create your store management system:
- **Create a class hierarchy** – Develop a superclass that represents a product or service your business offers and one or more subclasses that extend the superclass to represent more specific types of products or services.
- **Declare instance variables** – Declare instance variables in the superclass that are shared with the subclasses and instance variables in the subclasses that are not shared with the superclass.
- **Write constructors** – Write no-argument and parameterized constructors in the superclass and subclasses. Subclass constructors use the super keyword to call the superclass constructor.
- **Implement accessor and mutator methods** – Write accessor and mutator methods for instance variables that should be accessible and/or modifiable from outside of the class.
- **Implement a toString() method** – Write toString() methods in the superclass and subclasses that return information about the state of an object.

## UML Diagram

![UML Diagram for my project](UMLdiagram.png)

## Description

My project demonstrates a store management system for a jewelery or accessory store. It features two main accessories which are bracelets and necklaces. My UML diagram above features all my methods along with the instance variables I assigned for each class. I used a scanner method so that we can use user input and print it out. I set default values using no argument constructor along with a parameterized constructor for each class. In my tester class I was able to demonstrate how I used my toString method to print out all the accessories from the classes along with overrides to effectively showcase the toString method. 
