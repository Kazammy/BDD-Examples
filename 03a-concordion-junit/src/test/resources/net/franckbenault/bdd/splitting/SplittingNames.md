# Splitting Names

To help personalise our mailshots we want to have the first name and last name of the customer. 
Unfortunately the customer data that we are supplied only contains full names.

The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.

### [Example](- "basic")

The full name [Jane Smith](- "#name") is [broken](- "#firstLastName = split(#name)") into first name [Jane](- "?=#firstLastName.firstName") and last name [Smith](- "?=#firstLastName.lastName").