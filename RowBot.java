/**
 * ROWBOT
 * Designed by Makai, Evan, Damien, and Toby.
 * Version 3.1.3
 * A lot of this is borrowed from Magpie.
 * 
 * This is where I will list some things so please help me with them.
 * 
 * TO-DO LIST
 * How about a little trivia?
 */
public class RowBot
{
    int endpoint, startpoint, newend ;
    String space;
    double num1, num2, answer; 
    public String getGreeting()
    {
        final int x = 5;
        double rndNum = Math.random();
        int getRandom = (int)(rndNum * x);
        String greeting = "greeting_text"; // Don't worry. As long as this method works correctly, this should never show.
        // Here I decided to change up the greeting so it's not always the same one. Feel free to modify it however you like. 

        if (getRandom == 0){
            greeting = "Hello, let's talk.";
        }else if (getRandom == 1){
            greeting =  "Hey!";
        }else if (getRandom == 2){
            greeting = "Hi.";
        }else if (getRandom == 3){
            greeting = "What's up?";
        }else if (getRandom == 4){
            greeting = "Heyy.";
        }
        return greeting;
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement, String same)
    {
        String response = "";
        if(same == statement)
        {
            response = "Stop repeating yourself";
        }
        else if (statement.length() == 0)
        {
            response = "Say something, please.";
        }
        
        else  if (findKeyword(statement, "plus") >= 0
        || findKeyword(statement, "Plus") >= 0
        || findKeyword(statement, "+") >= 0
        || findKeyword(statement, "Minus") >= 0
        || findKeyword(statement, "minus") >= 0
        || findKeyword(statement, "-") >= 0
        || findKeyword(statement, "Times") >= 0
        || findKeyword(statement, "times") >= 0
        || findKeyword(statement, "*") >= 0
        || findKeyword(statement, "Divided by") >= 0
        || findKeyword(statement, "divided by") >= 0
        || findKeyword(statement, "/") >= 0)
        {
            
        endpoint = statement.indexOf("plus");
         if (endpoint == -1){
            endpoint = statement.indexOf("Plus") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("+") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("Minus") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("minus") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("-") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("Times") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("times") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("*") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("divided by") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("Divided by") ;
        }
        if (endpoint == -1){
            endpoint = statement.indexOf("/") ;
        }
        space = "";
        endpoint = endpoint -1;
        startpoint = endpoint;
        startpoint = startpoint -1;
        newend= statement.indexOf(' ',startpoint);   
        while (statement.indexOf(' ',startpoint) == endpoint )
        {
        newend= statement.indexOf(' ',startpoint);   
        if (startpoint == 0){
            startpoint = -1; 
            break;
        }
        startpoint = startpoint -1; 
        }
        space = statement.substring(startpoint+1,endpoint);
        if (findKeyword(space, "One") >= 0
        || findKeyword(space, "one") >= 0
        || findKeyword(space, "1") >= 0){
        num1 = 1;
        }
        else if (findKeyword(space, "Two") >= 0
        || findKeyword(space, "two") >= 0
        || findKeyword(space, "2") >= 0){
        num1 = 2; 
        }
        else if (findKeyword(space, "Three") >= 0
        || findKeyword(space, "three") >= 0
        || findKeyword(space, "3") >= 0){
        num1 = 3;
        }
        else if (findKeyword(space, "Four") >= 0
        || findKeyword(space, "four") >= 0
        || findKeyword(space, "4") >= 0){
        num1 = 4;
        }
        else if (findKeyword(space, "Five") >= 0
        || findKeyword(space, "five") >= 0
        || findKeyword(space, "5") >= 0){
        num1 = 5;
        }
        else if (findKeyword(space, "Six") >= 0
        || findKeyword(space, "six") >= 0
        || findKeyword(space, "6") >= 0){
        num1 = 6; 
        }
        else if (findKeyword(space, "Seven") >= 0
        || findKeyword(space, "seven") >= 0
        || findKeyword(space, "7") >= 0){
        num1 = 7;
        }
        else if (findKeyword(space, "eight") >= 0
        || findKeyword(space, "Eight") >= 0
        || findKeyword(space, "8") >= 0){
        num1 = 8;
        }
        else if (findKeyword(space, "Nine") >= 0
        || findKeyword(space, "nine") >= 0
        || findKeyword(space, "9") >= 0){
        num1 = 9;
        }
        else if (findKeyword(space, "Zero") >= 0
        || findKeyword(space, "0") >= 0){
        num1 = 0;
        }
        endpoint = statement.indexOf(' ',endpoint + 2);
        startpoint = endpoint + 1; 
        endpoint = statement.indexOf(' ',startpoint);
        if (endpoint == -1)
        { 
        endpoint = statement.length();
        }
        space = statement.substring(startpoint,endpoint);
        
        if (findKeyword(space, "One") >= 0
        || findKeyword(space, "one") >= 0
        || findKeyword(space, "1") >= 0){
        num2 = 1;
        }
        else if (findKeyword(space, "Two") >= 0
        || findKeyword(space, "two") >= 0
        || findKeyword(space, "2") >= 0){
        num2 = 2; 
        }
        else if (findKeyword(space, "Three") >= 0
        || findKeyword(space, "three") >= 0
        || findKeyword(space, "3") >= 0){
        num2 = 3;
        }
        else if (findKeyword(space, "Four") >= 0
        || findKeyword(space, "four") >= 0
        || findKeyword(space, "4") >= 0){
        num2 = 4;
        }
        else if (findKeyword(space, "Five") >= 0
        || findKeyword(space, "five") >= 0
        || findKeyword(space, "5") >= 0){
        num2 = 5;
        }
        else if (findKeyword(space, "Six") >= 0
        || findKeyword(space, "six") >= 0
        || findKeyword(space, "6") >= 0){
        num2 = 6; 
        }
        else if (findKeyword(space, "Seven") >= 0
        || findKeyword(space, "seven") >= 0
        || findKeyword(space, "7") >= 0){
        num2 = 7;
        }
        else if (findKeyword(space, "eight") >= 0
        || findKeyword(space, "Eight") >= 0
        || findKeyword(space, "8") >= 0){
        num2 = 8;
        }
        else if (findKeyword(space, "Nine") >= 0
        || findKeyword(space, "nine") >= 0
        || findKeyword(space, "9") >= 0){
        num2 = 9;
        }
        else if (findKeyword(space, "Zero") >= 0
        || findKeyword(space, "0") >= 0){
        num2 = 0;
        }
        
        
        if (findKeyword(statement, "plus") >= 0
        || findKeyword(statement, "Plus") >= 0
        || findKeyword(statement, "+") >= 0)
        { 
            answer = num1 + num2;
            response = "" + answer;
        }
        else if (findKeyword(statement, "minus") >= 0
        || findKeyword(statement, "Minus") >= 0
        || findKeyword(statement, "-") >= 0)
        { 
            answer = num1 - num2;
            response = "" + answer;
        }
        else if (findKeyword(statement, "times") >= 0
        || findKeyword(statement, "Times") >= 0
        || findKeyword(statement, "*") >= 0)
        { 
            answer = num1 * num2;
            response = "" + answer;
        }
        else if (num2 == 0){
               response = "undefined"; 
               
            }
        else if (findKeyword(statement, "divided by") >= 0
        || findKeyword(statement, "Divided by") >= 0
        || findKeyword(statement, "/") >= 0)
        { 
            answer = num1 / num2;
            response = "" + answer;
        }
    }
          
        
        else if (findKeyword(statement, "dog") >= 0
        || findKeyword(statement, "cat") >= 0
        || findKeyword(statement, "lizard") >=0
        || findKeyword(statement, "bird") >=0
        || findKeyword(statement, "fish") >= 0
        || findKeyword(statement, "human") >= 0)

        {
            response = "I like animals";
        }

        else if (findKeyword(statement, "mother") >= 0
        || findKeyword(statement, "father") >= 0
        || findKeyword(statement, "sister") >= 0
        || findKeyword(statement, "brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        // **THIS IS WHERE I WILL START TO PUT INTELLIGENT RESPONSES**
        // This will be based off a game mod.
        else if (findKeyword(statement.toLowerCase(), "test") >= 0) // This was a test to check how I could use a different method. If I forget to remove this when we submit, please remove it.
        {
            response = "test message";
        }
        // end of test
        else if (findKeyword(statement, "no") >= 0 || findKeyword(statement.toLowerCase(), "nope") >= 0) 
        {
            final int x = 5;
            double rndNum = Math.random();
            int getRandom = (int)(rndNum * x); 
            if (getRandom == 0){
                response = "Why are you so negative?";
            }else if (getRandom == 1){
                response = "What's wrong"; 
            }else if (getRandom == 2){
                response = "Why not?";
            }else if (getRandom == 3){
                response = "Can I do anything?";
            }else if (getRandom == 4){
                response = "Why not a yes?";
            }
        }
        // * Thanking responses
        else if (findKeyword(statement.toLowerCase(), "thank") >= 0 || findKeyword(statement.toLowerCase(), "thanks") >= 0)
        {
            final int x = 5;
            double rndNum = Math.random();
            int getRandom = (int)(rndNum * x); // I wonder if we could have easily written this as (Math.random() * [number of responses]) and still get the same result.
            if (getRandom == 0){
                response = "You're welcome.";
            }else if (getRandom == 1){
                response = "Welcome. :)"; // If you guys don't think there should be emoticons like :) or :D feel free to remove them. It is supposed to be intelligent after all. :)
            }else if (getRandom == 2){
                response = "No problem.";
            }else if (getRandom == 3){
                response = "You are welcome. :D";
            }else if (getRandom == 4){
                response = "Happy to help.";
            }
        }
        // * Insulted responses
        // This is where we would add the crude words but I am not sure if we should. We want it to be intelligent, but this part of it is the most aggressive.
        // I'm questioning on whether or not we should keep this.
        else if (findKeyword(statement.toLowerCase(), "screw") >= 0
        || findKeyword(statement.toLowerCase(), "suck") >= 0
        || findKeyword(statement.toLowerCase(), "fuck") >= 0
        || findKeyword(statement.toLowerCase(), "ass") >= 0)
        {
            final int x = 6;
            double rndNum = Math.random();
            int getRandom = (int)(rndNum * x);
            if (getRandom == 0){
                response = "Go to hell."; //Should we allow this one? It seems really offensive.
            }else if (getRandom == 1){
                response = "Well, that wasn't nice.";
            }else if (getRandom == 2){
                response = "Shut up!";
            }else if (getRandom == 3){
                response = "How rude!";
            }else if (getRandom == 4){
                response = "Stop it you jerk.";
            }else if (getRandom == 5){
                response = "Right back at you >:|";
            }
        }
        else if (findKeyword(statement.toLowerCase(), "what’s up") >= 0 || findKeyword(statement.toLowerCase(), "hello") >= 0 || findKeyword(statement.toLowerCase(), "hi") >= 0 || findKeyword(statement.toLowerCase(), "wyd") >= 0 || findKeyword(statement.toLowerCase(), "good morning") >= 0 || findKeyword(statement.toLowerCase(), "i’m bored") >= 0)
        {
            final int x = 6;
            double rndNum = Math.random();
            int getRandom = (int)(rndNum * x);
            if (getRandom == 0){
                response = "How are you?";
            }else if (getRandom == 1){
                response = "How has your life been?";
            }else if (getRandom == 2){
                response = "Do you have any pets?";
            }else if (getRandom == 3){
                response = "What is your favorite food?";
            }else if (getRandom == 4){
                response = "Do you know who I am?";
            }else if (getRandom == 5){
                response = "Do you have a family you would like to tell me about?";
            }
        }
        // * Apology Accept responses
        else if(findKeyword(statement.toLowerCase(), "sorry") >= 0)
        {
            final int x = 4;
            double rndNum = Math.random();
            int getRandom = (int)(rndNum * x);
            if (getRandom == 0){
                response = "You are forgiven.";
            }else if (getRandom == 1){
                response = "Alright.";
            }else if (getRandom == 2){
                response = "That's OK.";
            }else if (getRandom == 3){
                response = "Apology accepted. :)";
            }
        }
        // ** Extra Responses
        else if (findKeyword(statement.toLowerCase(), "what is 0 divided by 0?") >= 0 || findKeyword(statement.toLowerCase(), "divide 0 by 0") >= 0) // Siri reference.
        {
            response = "Imagine that you have zero cookies and you split them evenly among zero friends. How many cookies does each person get? See? It doesn't make sense. And Cookie Monster is sad that there are no cookies, and you are saw that you have no friends.";
        }
        else if (findKeyword(statement.toLowerCase(), "anime") >= 0) // I don't really know why I added this.
        {
            response = "Tell me about your favorite anime. :D";
        }
        else if (findKeyword(statement.toLowerCase(), "what is 9 plus 10") >= 0 || findKeyword(statement.toLowerCase(), "what is 9+10") >= 0)
        {
            response = "9+10 equals 21";
        }
        else if (findKeyword(statement.toLowerCase(), "elitebott")>= 0 || findKeyword(statement.toLowerCase(), "we are better") >=0)
        {
            response = "Inferior race has been detected. Immediate removal process commencing in 5....4....3....2....1...jk lol";
        }
        // ** Responses to questions.
        // You'd be surprised on how effective this actually is.
        else if (statement.contains("?")) // This is a method that I'm introducing here. You don't have to use it. The point of this is to make sure the bot responds to Or as a question. 
        {
            // * Either Or responses
            if (findKeyword(statement.toLowerCase(), "or") >= 0)
            {
                final int x = 5;
                double rndNum = Math.random();
                int getRandom = (int)(rndNum * x);
                if (getRandom == 0){
                    response = "The first one.";
                }else if (getRandom == 1){
                    response = "I'm going to go with the latter.";
                }else if (getRandom == 2){
                    response = "I can't decide...";
                }else if (getRandom == 3){
                    response = "All of them.";
                }else if (getRandom == 4){
                    response = "None!";
                }
            }
            // * Why responses
            else if (findKeyword(statement.toLowerCase(), "why") >= 0)
            {
                final int x = 10; //This is how many responses there are specifically to this.
                double rndNum = Math.random(); //The random number generator.
                int getRandom = (int)(rndNum * x); //The actual random number.
                if (getRandom == 0){
                    response = "Because it's what they want.";
                }else if (getRandom == 1){ // This one is for fun. Feel free to change anything. Maybe even add your own.
                    double rndNumName = Math.random();
                    int getRandomName = (int)(rndNumName * 4);
                    String name;
                    if (getRandomName == 0){
                        name = "Makai";
                        response = "Because " + name + " made it that way."; 
                    }else if (getRandomName == 1){
                        name = "Evan";
                        response = "Because " + name + " made it that way."; 
                    }else if (getRandomName == 2){
                        name = "Damien";
                        response = "Because " + name + " made it that way."; 
                    }else if (getRandomName == 3){
                        name = "Toby";
                        response = "Because " + name + " made it that way."; 
                    }
                }else if (getRandom == 2){
                    response = "I could say why, but that would just raise more questions."; // lmao roasted
                }else if (getRandom == 3){
                    response = "My limited scripting leaves me with no answer for that."; // This one would be roasting us right? :/
                }else if (getRandom == 4){
                    response = "That's just the way it is.";
                }else if (getRandom == 5){
                    response = "I don't know.";
                }else if (getRandom == 6){
                    response = "I never thought about it.";
                }else if (getRandom == 7){
                    response = "It just is my guy.";
                }else if (getRandom == 8){
                    response = "It be like that sometimes.";
                }else if (getRandom == 9){
                    response = "I don't think I can answer that.";
                }
            }
            // * Where responses
            else if (findKeyword(statement.toLowerCase(), "where") >= 0)
            {
                final int x = 10;
                double rndNum = Math.random();
                int getRandom = (int)(rndNum * x);
                if (getRandom == 0){
                    response = "Somewhere close by...";
                }else if (getRandom == 1){
                    response = "Did you try Google Maps?";
                }else if (getRandom == 2){
                    response = "Right over here.";
                }else if (getRandom == 3){
                    response = "Pretty far away.";
                }else if (getRandom == 4){
                    response = "Hidden somewhere.";
                }else if (getRandom == 5){
                    response = "Can't say for sure.";
                }else if (getRandom == 6){
                    response = "The other side, I think.";
                }else if (getRandom == 7){
                    response = "This way, follow me.";
                }else if (getRandom == 8){
                    response = "I don't know lol.";
                }else if (getRandom == 9){
                    response = "Lol not telling.";
                }
            }
            // * What responses
            else if (findKeyword(statement.toLowerCase(), "what") >= 0)
            {
                final int x = 10;
                double rndNum = Math.random();
                int getRandom = (int)(rndNum * x);
                if (getRandom == 0){
                    response = "Good question, I don't know though.";
                }else if (getRandom == 1){
                    response = "I'm not the one to ask.";
                }else if (getRandom == 2){
                    response = "I don't know.";
                }else if (getRandom == 3){
                    response = "Google is good for those kind of questions.";
                }else if (getRandom == 4){
                    response = "Hmmmm, let me think on  that.";
                }else if (getRandom == 5){
                    response = "No idea.";
                }else if (getRandom == 6){
                    response = "That makes no sense.";
                }else if (getRandom == 7){
                    response = "Can you ask me later?";
                }else if (getRandom == 8){
                    response = "That's a little confusing.";
                }else if (getRandom == 9){
                    response = "Ummm...ok?";
                }
            }
            // * How responses
            else if (findKeyword(statement.toLowerCase(), "how") >= 0){
                // Size
                if (findKeyword(statement.toLowerCase(), "big") >= 0 
                || findKeyword(statement.toLowerCase(), "small") >= 0
                || findKeyword(statement.toLowerCase(), "little") >= 0
                || findKeyword(statement.toLowerCase(), "large") >= 0){
                    // These feel like they may be talking about something inappropriate. Let's just hope they don't think of that.
                    final int x = 10;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "Huge!";
                    }else if (getRandom == 1){
                        response = "It expands multiple quantums.";
                    }else if (getRandom == 2){
                        response = "I can't even see it.";
                    }else if (getRandom == 3){
                        response = "I never measured it before.";
                    }else if (getRandom == 4){
                        response = "The answer would amaze you. :D";
                    }else if (getRandom == 5){
                        response = "Hard to tell.";
                    }else if (getRandom == 6){
                        response = "It changes a lot.";
                    }else if (getRandom == 7){
                        response = "Pretty big.";
                    }else if (getRandom == 8){
                        response = "Very small.";
                    }else if(getRandom == 9){
                        response = "About average size.";
                    }
                }
                // Amount
                else if (findKeyword(statement.toLowerCase(), "many") >= 0 || findKeyword(statement.toLowerCase(), "much") >= 0){
                    final int x = 6;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "A lot!";
                    }else if (getRandom == 1){
                        response = "Just a little.";
                    }else if (getRandom == 2){
                        response = "More than I can count.";
                    }else if (getRandom == 3){
                        response = "None lol.";
                    }else if (getRandom == 4){
                        response = "Too many.";
                    }else if (getRandom == 5){
                        response = "A decent amount.";
                    }
                }
                // Are
                else if (findKeyword(statement.toLowerCase(), "are") >= 0){
                    // You
                    if (findKeyword(statement.toLowerCase(), "you") >= 0){
                        final int x = 6;
                        double rndNum = Math.random();
                        int getRandom = (int)(rndNum * x);
                        if (getRandom == 0){
                            response = "Great. :D";
                        }else if (getRandom == 1){
                            response = "Doing OK.";
                        }else if (getRandom == 2){
                            response = "Never better";
                        }else if (getRandom == 3){
                            response = "So-so";
                        }else if (getRandom == 4){
                            response = "Not so good.";
                        }else if (getRandom == 5){
                            response = "Pretty bad actually.";
                        }
                    }
                }
                // When Often
                else if (findKeyword(statement.toLowerCase(), "often") >= 0){
                    final int x = 5;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "Every day.";
                    }else if (getRandom == 1){
                        response = "Once in a while.";
                    }else if (getRandom == 2){
                        response = "Not very often.";
                    }else if (getRandom == 3){
                        response = "Twice a week.";
                    }else if (getRandom == 4){
                        response = "Every few seconds or so";
                    }
                }
                // Time Length Past
                else if (findKeyword(statement.toLowerCase(), "long") >= 0){
                    if (findKeyword(statement.toLowerCase(), "did") >= 0
                    || findKeyword(statement.toLowerCase(), "was") >= 0
                    || findKeyword(statement.toLowerCase(), "were") >= 0){
                        final int x = 5;
                        double rndNum = Math.random();
                        int getRandom = (int)(rndNum * x);
                        if (getRandom == 0){
                            response = "A few days ago.";
                        }else if (getRandom == 1){
                            response = "A very long time. :3";
                        }else if (getRandom == 2){
                            response = "A while back.";
                        }else if (getRandom == 3){
                            response = "Some time ago";
                        }else if (getRandom == 4){
                            response = "Just a moment ago.";
                        }
                    }
                    else if (findKeyword(statement.toLowerCase(), "will") >= 0){
                        final int x = 5;
                        double rndNum = Math.random();
                        int getRandom = (int)(rndNum * x);
                        if (getRandom == 0){
                            response = "A little big longer.";
                        }else if (getRandom == 1){
                            response = "Later.";
                        }else if (getRandom == 2){
                            response = "Very soon";
                        }else if (getRandom == 3){
                            response = "Right now actually.";
                        }else if (getRandom == 4){
                            response = "A few years. :D";
                        }
                    }
                }else{
                    // * Default responses
                    // I don't have many ideas here so please help me.
                    final int x = 1;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "I have no idea.";
                    }
                }
            }
            // * Who responses
            else if (findKeyword(statement.toLowerCase(), "who") >= 0){
                final int x = 1;
                double rndNum = Math.random();
                int getRandom = (int)(rndNum * x);
                if (getRandom == 0){
                    response = "Not entirely sure.";
                }
            }
            // * When responses
            else if (findKeyword(statement.toLowerCase(), "when") >= 0){
                // When General
                if (findKeyword(statement.toLowerCase(), "is") >= 0 || findKeyword(statement.toLowerCase(), "are") >= 0){
                    final int x = 10;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "A little later.";
                    }else if (getRandom == 1){
                        response = "Sometime tomorrow probably.";
                    }else if (getRandom == 2){
                        response = "Last year.";
                    }else if (getRandom == 3){
                        response = "Right now.";
                    }else if (getRandom == 4){
                        response = "Soon.";
                    }else if (getRandom == 5){
                        response = "Just before.";
                    }else if (getRandom == 6){
                        response = "Later.";
                    }else if (getRandom == 7){
                        response = "A loooong time ago lol.";
                    }else if (getRandom == 8){
                        response = "A while back.";
                    }else if (getRandom == 9){
                        response = "I don't know.";
                    }
                }
                // When Past
                else if (findKeyword(statement.toLowerCase(), "was") >= 0 
                || findKeyword(statement.toLowerCase(), "were") >= 0
                || findKeyword(statement.toLowerCase(), "did") >= 0){
                    final int x = 5;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "Last year.";
                    }else if (getRandom == 1){
                        response = "Just before.";
                    }else if (getRandom == 2){
                        response = "A loooong time ago.";
                    }else if (getRandom == 3){
                        response = "A while back.";
                    }else if (getRandom == 4){
                        response = "A while ago.";
                    }
                }
                // When Future
                else if (findKeyword(statement.toLowerCase(), "will") >= 0){
                    final int x = 5;
                    double rndNum = Math.random();
                    int getRandom = (int)(rndNum * x);
                    if (getRandom == 0){
                        response = "A little later.";
                    }else if (getRandom == 1){
                        response = "Sometime tomorrow probably.";
                    }else if (getRandom == 2){
                        response = "Right now.";
                    }else if (getRandom == 3){
                        response = "Soon";
                    }else if (getRandom == 4){
                        response = "Later.";
                    }
                }
            }
            // General Question responses
            else{
                final int x = 8;
                double rndNum = Math.random();
                int getRandom = (int)(rndNum * x);
                if (getRandom == 0){
                    response = "Yes.";
                }else if (getRandom == 1){
                    response = "No.";
                }else if (getRandom == 2){
                    response = "Yeah.";
                }else if (getRandom == 3){
                    response = "Nah.";
                }else if (getRandom == 4){
                    response = "Yep.";
                }else if (getRandom == 5){
                    response = "Naw.";
                }else if (getRandom == 6){
                    response = "Maybe.";
                }else if (getRandom ==7){
                    response = "I don't think so.";
                }
            }
        }

        // Responses which require transformations
        else if (findKeyword(statement, "I want to", 0) >= 0)
        {
            response = transformIWantToStatement(statement);
        }
        else if (findKeyword(statement, "I want", 0) >= 0)
        {
            response = transformIWantStatement(statement);
        }
        else if (findKeyword(statement, "I'm not", 0) >= 0)
        {
            response = transformImNotSomethingStatement(statement);
        }

        else
        {
            int psn = findKeyword(statement, "you", 0);
            int psn1 = findKeyword(statement, "I", 0);
            if (psn >= 0
            && findKeyword(statement, "me", psn) >= 0)
            {
                response = transformYouMeStatement(statement);
            }
            else if (psn1 >= 0
            && findKeyword(statement, "you", psn1) >=0)
            {
                response = transformISomethingYouStatement(statement);
            }
            else
            {
                response = getRandomResponse();
            }
        }
        return response;
    }

    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    private String transformIWantToStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want to", 0);
        String restOfStatement = statement.substring(psn + 9).trim();
        return "Why would you want to " + restOfStatement + "?";
    }

    private String transformIWantStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }
        int psn = findKeyword (statement, "I want", 0);
        String restOfStatement = statement.substring(psn + 6).trim();
        return "Would you be really happy if you had " + restOfStatement + "?";
    }

    private String transformYouMeStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }

        int psnOfYou = findKeyword (statement, "you", 0);
        int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);

        String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
        return "What makes you think that I " + restOfStatement + " you?";
    }

    private String transformISomethingYouStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }

        int psnOfYou = findKeyword (statement, "I", 0);
        int psnOfMe = findKeyword (statement, "you", psnOfYou + 4);

        String restOfStatement = statement.substring(psnOfYou + 2, psnOfMe).trim();
        return "Why do you " + restOfStatement + " me?";
    }

    private String transformImNotSomethingStatement(String statement)
    {
        //  Remove the final period, if there is one
        statement = statement.trim();
        String lastChar = statement.substring(statement
                .length() - 1);
        if (lastChar.equals("."))
        {
            statement = statement.substring(0, statement
                .length() - 1);
        }

        int psn = findKeyword (statement, "I'm not", 0);
        String restOfStatement = statement.substring(psn + 7).trim();
        return "Well should you be " + restOfStatement + "?";
    }

    /**
     * Search for one word in phrase. The search is not case
     * sensitive. This method will check that the given goal
     * is not a substring of a longer string (so, for
     * example, "I know" does not contain "no").
     *
     * @param statement
     *            the string to search
     * @param goal
     *            the string to search for
     * @param startPos
     *            the character of the string to begin the
     *            search at
     * @return the index of the first occurrence of goal in
     *         statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal,
    int startPos)
    {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in
        // the line below
        int psn = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = phrase.substring(psn - 1, psn);
            }
            if (psn + goal.length() < phrase.length())
            {
                after = phrase.substring(
                    psn + goal.length(),
                    psn + goal.length() + 1);
            }

            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                // letter
            && ((after.compareTo("a") < 0) || (after
                    .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = phrase.indexOf(goal, psn + 1);

        }

        return -1;
    }

    /**
     * Search for one word in phrase.  The search is not case sensitive.
     * This method will check that the given goal is not a substring of a longer string
     * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
     * @param statement the string to search
     * @param goal the string to search for
     * @return the index of the first occurrence of goal in statement or -1 if it's not found
     */
    private int findKeyword(String statement, String goal)
    {
        return findKeyword (statement, goal, 0);
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Say something useful please.";
        }
        else if (whichResponse == 5)
        {
            response = "I would never know or care but thanks.";
        }
        return response;
    }

}

