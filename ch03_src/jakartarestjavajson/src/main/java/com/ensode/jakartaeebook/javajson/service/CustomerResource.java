package com.ensode.jakartaeebook.javajson.service;

import com.ensode.jakartaeebook.javajson.entity.Customer;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David R. Heffelfinger <dheffelfinger@ensode.com>
 */
@Path("customer")
public class CustomerResource {

  private static final Logger LOG = Logger.getLogger(CustomerResource.class.getName());

  private final Customer customer;

  public CustomerResource() {
    customer = new Customer(1L, "David",
            "Raymond", "Heffelfinger");
  }

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Customer getCustomer() {
    //in a "real" RESTful service, we would retrieve data from a database
    //then return an XML representation of the data.

    LOG.log(Level.INFO, "{0}.getCustomer() invoked", this.getClass().getCanonicalName());

    return customer;
  }

  @POST
  @Consumes(MediaType.APPLICATION_JSON)
  public void updateCustomer(Customer customer) {
    //in a "real" RESTful service, we would parse the XML
    //received in the customer XML parameter, then update
    //a row in the database.

    LOG.log(Level.INFO, "{0}.updateCustomer() invoked", this.getClass().getCanonicalName());

    LOG.log(Level.INFO, "got the following customer: {0}", customer);
  }

  @PUT
  @Consumes(MediaType.APPLICATION_JSON)
  public void createCustomer(Customer customer) {
    //in a "real" RESTful service, we would insert
    //a new row into the database with the data in the
    //customer parameter

    LOG.log(Level.INFO, "{0}.createCustomer() invoked", this.getClass().getCanonicalName());

    LOG.log(Level.INFO, "customer = {0}", customer);

  }

  @DELETE
  @Consumes(MediaType.APPLICATION_JSON)
  public void deleteCustomer(Customer customer) {
    //in a "real" RESTful service, we would delete a row
    //from the database corresponding to the customer parameter
    LOG.log(Level.INFO, "{0}.deleteCustomer() invoked", this.getClass().getCanonicalName());

    LOG.log(Level.INFO, "customer = {0}", customer);
  }
}
