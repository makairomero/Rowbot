/**
 * Designed by Makai, Evan, Damien, and Toby.
 * Version 2.2
 * A lot of this is borrowed from Magpie.
 * 
 * This is where I will list some things so please help me with them.
 * 
 * Should this bot react to crude words?
 * Possibly math stuff.
 * New keyword finders.
 * How about a little trivia?
 */
public class RowBot
{

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

        else if (findKeyword(statement, "no") >= 0)
        {
            response = "Why so negative?";
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
        else if (findKeyword(statement.toLowerCase(), "screw") >= 0 || findKeyword(statement.toLowerCase(), "suck") >= 0)
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
            response = "Imagine that you have zero cookies and you split them evenly among zero friends. How many cookies does each person get? See? It doesn't amke sense. And Cookie Monster is sad that there are no cookies, and you are saw that you have no friends.";
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
                    response = "My limited scripting leaves me with no answer for that.";
                }else if (getRandom == 4){
                    response = "That's just the way it is.";
                }else if (getRandom == 5){
                    response = "I don't know.";
                }else if (getRandom == 6){
                    response = "I never thought about it.";
                }else if (getRandom == 7){
                    response = "It just is my guy.";
                }else if (getRandom == 8){
                    response = "It be like that sometimes. ";
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
                if (findKeyword(statement.toLowerCase(), "big") >= 0 || findKeyword(statement.toLowerCase(), "small") >= 0){
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
                        response = "It changes a lot";
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
            // Look for a two word (you <something> me)
            // pattern
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

