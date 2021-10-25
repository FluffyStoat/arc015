module su.ermine.orders {
    opens su.ermine.orders;

    requires spring.cloud.gcp.data.datastore;
    requires spring.boot;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires spring.boot.autoconfigure;
}