package com.neyaz.jobSearchPortal.Service;
import com.neyaz.jobSearchPortal.Model.Job;
import com.neyaz.jobSearchPortal.Model.JobType;
import com.neyaz.jobSearchPortal.Repository.JobRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class JobService {

    private final JobRepository JobRepository;

    @Autowired
    public JobService(JobRepository jobRepository) {
        this.JobRepository = jobRepository;
    }


    public String createJob(Job job) {
        Job savedJob =JobRepository.save(job);
        return "Job created with ID: " + savedJob.getId();
    }

    public String getJobById(Long id) {
        Optional<Job> jobOptional = JobRepository.findById(id);
        return jobOptional.map(job -> "Job found: " + job.toString()).orElse("Job not found");
    }

    public String updateJob(Long id, Job job) {
        Optional<Job> existingJobOptional = JobRepository.findById(id);
        if (existingJobOptional.isPresent()) {
            Job existingJob = existingJobOptional.get();
            existingJob.setTitle(job.getTitle());
            existingJob.setDescription(job.getDescription());
            existingJob.setLocation(job.getLocation());
            existingJob.setSalary(job.getSalary());
            existingJob.setCompanyEmail(job.getCompanyEmail());
            existingJob.setCompanyName(job.getCompanyName());
            existingJob.setEmployerName(job.getEmployerName());
            existingJob.setJobType(job.getJobType());
            existingJob.setAppliedDate(job.getAppliedDate());
            JobRepository.save(existingJob);
            return "Job updated with ID: " + existingJob.getId();
        } else {
            return "Job not found";
        }
    }

    public String deleteJob(Long id) {
        JobRepository.deleteById(id);
        return "Job with ID " + id + " deleted";
    }
    public String searchJobsByTitleAndDescription(String title, String description) {
        List<Job> jobs = JobRepository.findByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(title, description);
        return "Search result: " + jobs.toString();
    }

    public String searchJobsByTitle(String title) {
        List<Job> jobs = JobRepository.findByTitleContainingIgnoreCase(title);
        return "Search result: " + jobs.toString();
    }

    public String searchJobsByDescription(String description) {
        List<Job> jobs = JobRepository.findByDescriptionContainingIgnoreCase(description);
        return "Search result: " + jobs.toString();
    }



    public String searchJobsWithSalaryAbove(double salary) {
        List<Job> jobs = JobRepository.findJobsWithSalaryAbove(salary);
        return "Search result: " + jobs.toString();}




    public String searchJobsByCompanyName(String companyName) {
        List<Job> jobs = JobRepository.findJobsByCompanyName(companyName);
        return "Search result: " + jobs.toString();
    }
    public String searchJobsByEmployerName(String employerName) {
        List<Job> jobs = JobRepository.findJobsByEmployerName(employerName);
        return "Search result: " + jobs.toString();
    }

    public String searchJobsByType(JobType jobType) {
        List<Job> jobs = JobRepository.findByJobType(jobType);
        return "Search result: " + jobs.toString();
    }


    public String searchJobsByLocation(String location) {
        List<Job> jobs = JobRepository.findJobsByLocation(location);
        return "Search result: " + jobs.toString();
    }

}
