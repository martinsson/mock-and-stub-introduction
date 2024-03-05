<?php


namespace mock_and_stub_introduction\spy;

class BirthdayService {
    
    private $clientRepository;
    private $mailer;

    public function __construct($clientRepository, Mailer $mailer) {
        $this->clientRepository = $clientRepository;
        $this->mailer = $mailer;
    }
    
    public function greetingFor($name) {
        $greeting = "";
        if ($this->clientRepository->birthDayIsTodayFor($name)) {
            $greeting = "Happy birthday $name!";
        }
        else {
            $greeting = "Good morning $name.";
        }

        $this->mailer->send($greeting);
    }
    
}

?>
