sqlplus / as sysdba; 
alter session set container=orclpdb; 
alter pluggable database open; 
alter pluggable database orclpdb save state; 
alter user hr identified by hr account unlock; 
/
