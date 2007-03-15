package org.codehaus.enunciate.modules.rest;

import org.codehaus.enunciate.contract.validation.BaseValidator;
import org.codehaus.enunciate.contract.validation.ValidationResult;
import org.codehaus.enunciate.contract.rest.RESTMethod;

import java.util.List;
import java.util.Map;

/**
 * The default REST validator.
 * 
 * @author Ryan Heaton
 */
public class RESTValidator extends BaseValidator {

  @Override
  public ValidationResult validateRESTAPI(Map<String, List<RESTMethod>> restAPI) {
    ValidationResult result = super.validateRESTAPI(restAPI);

    // Can't think of any additional rules beyond what's
    // already in the default deployment module.... 

    return result;
  }
}