# Splitting Names

To help personalise our mailshots we want to have the first name and last name of the customer. 
Unfortunately the customer data that we are supplied only contains full names.

The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.

### [Example - basic](- "basic")

The full name [Jane Smith](- "#name") is [broken](- "#firstLastName = split(#name)") into first name [Jane](- "?=#firstLastName.firstName") and last name [Smith](- "?=#firstLastName.lastName").

### [Example - no last name](- "no last name")

The full name [Sting](- "#name") is [broken](- "#firstLastName = split(#name)") into first name [Sting](- "?=#firstLastName.firstName") and last name is [(null)] (- "?=#firstLastName.lastName").

### [Example - with title](- "with title")

The full name [Sir Bob Geldof](- "#name") is [broken](- "#firstLastName = split(#name)") into first name [Bob](- "?=#firstLastName.firstName") and last name is [Geldof] (- "?=#firstLastName.lastName").

### [Example - with long last name](- "with long last name")

The full name [Maria de los Santos](- "#name") is [broken](- "#firstLastName = split(#name)") into first name [Maria](- "?=#firstLastName.firstName") and last name is [de los Santos] (- "?=#firstLastName.lastName").

### [Example - Given when then](- "Given when then")

Given The full name [Jose de la grande Pina](- "#name")
 
When this full name is [broken](- "#firstLastName = split(#name)") 

Then the first name is [Jose] (- "?=#firstLastName.firstName") 

And the last name is [de la grande Pina] (- "?=#firstLastName.lastName").