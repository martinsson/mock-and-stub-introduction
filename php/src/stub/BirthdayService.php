<?php

namespace mock_and_stub_introduction\stub;

class BirthdayService {
    
    var $clientRepository;
    
    public function __construct($clientRepository) {
        $this->clientRepository = $clientRepository;
    }
    
    public function greetingFor($name) {
        $greeting = "";
        if ($this->clientRepository->birthDayIsTodayFor($name)) {
            $greeting = "Happy birthday $name!";
        }
        else {
            $greeting = "Good morning $name.";
        }
        return $greeting;
    }
    
}

?>
