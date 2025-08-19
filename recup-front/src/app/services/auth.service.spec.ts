import {AuthService} from './auth.service';
import {HttpTestingController, provideHttpClientTesting} from '@angular/common/http/testing';
import {TestBed} from '@angular/core/testing';
import {describe, expect, test} from '@jest/globals';


describe('AuthService', () => {
  let service: AuthService;
  let httpMock: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [
        AuthService,
        provideHttpClientTesting()
      ]
    });

    service = TestBed.inject(AuthService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  afterEach(() => {
    httpMock.verify();
  });

  test('devrait envoyer une requête de login', () => {
    const mockUser = {
      id: 1,
      name: 'Test',
      email: 'test@example.com'
    };

    const req = httpMock.expectOne('/api/login');
    expect(req.request.method).toBe('POST');
    expect(req.request.body).toEqual({ username: 'test@example.com', password: 'password123' });
    req.flush({ user: mockUser });

    expect(service.currentUser()).toEqual(mockUser);
  });

  test('devrait envoyer une requête POST à /api/logout', () => {
    service.logout().subscribe();

    const req = httpMock.expectOne('/api/logout');
    expect(req.request.method).toBe('POST');
    req.flush({});
  });

  test('devrait envoyer une requête POST à /api/revoke-token', () => {
    service.revokeToken().subscribe();

    const req = httpMock.expectOne('/api/revoke-token');
    expect(req.request.method).toBe('POST');
    req.flush({});
  });
});
