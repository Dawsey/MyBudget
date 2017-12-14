# MyBudget

In order to run this project, you need to download;
      preferably Netbeans IDE --> https://netbeans.org/downloads/
      MAMP: My Apache - MySQL - PHP --> https://www.mamp.info/en/downloads/
      
      
MyBudget   Desktop   Software   lets   users   to   keep   track   of   their   budget.   
When   the   user   selects   income radio   button   from   the   UI,      the   category   
combo   box   will   be   disabled   and   the   system   assumes   the category   of   the   transaction   as   “salary”.   
However,   if   expense   is   selected,   the   category   combo   box will   be   enabled   and   the   user   can   
choose   a   category   of   the   expense.

   Admin   user   can   login   to   the   system   and   perform   the   following   functions:
   
● Add ,    delete    transactions   from   the   database   and    update    transactions   in   the
database   using   the   corresponding   buttons   on   the   UI.

● New    button   clears   the   fields   and   make   all   buttons   except    add    invisible.

● By   clicking   a   row   on   the    table    on   the   UI,   all   the   fields   will   be   filled   with   the
information   belong   to   the   row   user   clicked.   Then,   user   can   perform  u   pdate ,    delete
or    clear    actions.

● Upload   Image   and   search   functionalities   will   be   available   in   later   versions.

● Different   currencies   will   be   available   in   later   versions.   That   is   why   the   design   is   a
combo   box.

● “Other”   category   will   be   available   to   save   data   in   later   versions.
(The   console   version   of   the   software   could   calculate   the   balance   (income   -   expenses)   of   the   user. 

However,   it   will   be   available   for   the   UI   in   later   versions).

● MVC   design   pattern   is   tried   to   be   used   in   general.   However,   in   the   view,   Swing   and MySQL   
is   used   together,   which   is   not   ideal   and   will   be   separated   for   the   later   version.

● Factory   method   is   used   as   an   architectural   pattern.

