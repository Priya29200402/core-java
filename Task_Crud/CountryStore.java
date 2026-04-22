package com.xworkz.task_crud;

public class CountryStore {

    Country[] countries = new Country[10];
    int index = 0;

    void save(Country country){
        if (country != null){
            if (index < this.countries.length){
                this.countries[this.index]=country;
                this.index++;
                System.out.println("Country is saved");
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println("country is null cannot save");
        }
    }

    Country findByName(String name){
        if (this.countries != null && name != null){
            for (Country country : this.countries){
                if (country != null){
                    if(name == country.name){
                        return country;
                    }
                }
            }
        }
        System.out.println("country not found");
        return null;
    }

    State findStateByStateName(String name){
        if (this.countries != null && name != null){
            for (Country country : this.countries){
                if (country != null && country.states != null){
                    for (State state : country.states){
                        if (state != null){
                            if(name == state.name){
                                return state;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("State not found");
        return null;
    }

    City[] findAllCityByStateName(String name){
        State state = findStateByStateName(name);
        if (state != null){
            return state.cities;
        }
        System.out.println("State not found");
        return null;
    }

    int findNoOfDistrictsByCityName(String name){
        if (this.countries != null && name != null){
            for (Country country : this.countries){
                if (country != null && country.states != null){
                    for (State state : country.states){
                        if (state != null && state.cities != null){
                            for (City city : state.cities){
                                if (city != null){
                                    if (name == city.name){
                                        return city.noOfDistricts;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("City not found");
        }
        return 0;
    }

    Country findByCollectorName(String collectorName){
        if (this.countries != null && collectorName != null){
            for (Country country : this.countries){
                if (country != null && country.states != null){
                    for (State state : country.states){
                        if (state != null && state.cities != null){
                            for (City city : state.cities){
                                if (city != null && city.districts != null){
                                    for (District district : city.districts){
                                        if (district != null && district.collector != null){
                                            if (collectorName ==  district.collector.name){
                                                return country;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Collector not found");
        return null;
    }
}